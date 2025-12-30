package subway.command.main.impl;

import subway.command.Command;
import subway.command.station.StationMenuOption;
import subway.service.SubwayService;
import subway.util.InputParser;
import subway.util.Retry;
import subway.view.InputView;
import subway.view.OutputView;

public class StationCommand implements Command {

    private static final String STATION = "지하철 역";

    private final SubwayService service;

    public StationCommand(SubwayService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        StationMenuOption option = getOption();

        if (option.equals(StationMenuOption.BACK)) {
            return;
        }

        Retry.retryUntilSuccess(() -> {
            String readStation = InputView.readStationForRegistration();
            String stationName =  InputParser.parseStation(readStation);
            service.registerStation(stationName);
        });

        OutputView.printRegistration(STATION);
    }

    private static StationMenuOption getOption() {
        return Retry.retryUntilSuccess(() -> {
            String selection = InputView.readStationMenuSelection();
            return StationMenuOption.from(selection);
        });
    }
}

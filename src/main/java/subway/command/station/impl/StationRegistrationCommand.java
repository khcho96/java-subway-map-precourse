package subway.command.station.impl;

import subway.command.Command;
import subway.service.SubwayService;
import subway.view.OutputView;

public class StationRegistrationCommand implements Command {

    private final SubwayService service;

    public StationRegistrationCommand(SubwayService service) {
        this.service = service;
    }

    @Override
    public void execute() {

    }
}

package subway.command.station.impl;

import subway.command.Command;
import subway.service.SubwayService;
import subway.view.OutputView;

public class StationDeleteCommand implements Command {

    private final SubwayService service;

    public StationDeleteCommand(SubwayService service) {
        this.service = service;
    }

    @Override
    public void execute() {

    }
}

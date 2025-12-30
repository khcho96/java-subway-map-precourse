package subway.command.main.impl;

import subway.command.Command;
import subway.service.SubwayService;
import subway.view.OutputView;

public class StationCommand implements Command {

    private final SubwayService service;

    public StationCommand(SubwayService service) {
        this.service = service;
    }

    @Override
    public void execute() {

    }
}

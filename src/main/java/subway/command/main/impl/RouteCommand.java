package subway.command.main.impl;

import subway.command.Command;
import subway.service.SubwayService;
import subway.view.OutputView;

public class RouteCommand implements Command {

    private final SubwayService service;

    public RouteCommand(SubwayService service) {
        this.service = service;
    }

    @Override
    public void execute() {

    }
}

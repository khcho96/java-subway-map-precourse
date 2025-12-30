package subway.command.main.impl;

import subway.command.Command;
import subway.service.SubwayService;
import subway.view.OutputView;

public class LineCommand implements Command {

    private final SubwayService service;

    public LineCommand(SubwayService service) {
        this.service = service;
    }

    @Override
    public void execute() {

    }
}

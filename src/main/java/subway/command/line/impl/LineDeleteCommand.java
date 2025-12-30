package subway.command.line.impl;

import subway.command.Command;
import subway.service.SubwayService;
import subway.view.OutputView;

public class LineDeleteCommand implements Command {

    private final SubwayService service;

    public LineDeleteCommand(SubwayService service) {
        this.service = service;
    }

    @Override
    public void execute() {

    }
}

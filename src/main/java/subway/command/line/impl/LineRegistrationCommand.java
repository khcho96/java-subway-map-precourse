package subway.command.line.impl;

import subway.command.Command;
import subway.service.SubwayService;
import subway.view.OutputView;

public class LineRegistrationCommand implements Command {

    private final SubwayService service;

    public LineRegistrationCommand(SubwayService service) {
        this.service = service;
    }

    @Override
    public void execute() {

    }
}

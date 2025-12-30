package subway.command.main.impl;

import subway.command.Command;
import subway.service.SubwayService;
import subway.view.OutputView;

public class SectionCommand implements Command {

    private final SubwayService service;

    public SectionCommand(SubwayService service) {
        this.service = service;
    }

    @Override
    public void execute() {

    }
}

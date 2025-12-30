package subway.command.section.impl;

import subway.command.Command;
import subway.service.SubwayService;
import subway.view.OutputView;

public class SectionDeleteCommand implements Command {

    private final SubwayService service;

    public SectionDeleteCommand(SubwayService service) {
        this.service = service;
    }

    @Override
    public void execute() {

    }
}

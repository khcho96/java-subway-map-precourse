package subway.command.main.impl;

import subway.command.Command;
import subway.command.section.SectionMenuCommandRegistry;
import subway.service.SubwayService;
import subway.view.OutputView;

public class SectionCommand implements Command {

    private final SubwayService service;
    private final SectionMenuCommandRegistry sectionRegistry;

    public SectionCommand(SubwayService service, SectionMenuCommandRegistry sectionRegistry) {
        this.service = service;
        this.sectionRegistry = sectionRegistry;
    }

    @Override
    public void execute() {

    }
}

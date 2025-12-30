package subway.command.section.impl;

import subway.command.Command;
import subway.service.SubwayService;
import subway.view.OutputView;

public class SectionRegistrationCommand implements Command {

    private final SubwayService service;

    public SectionRegistrationCommand(SubwayService service) {
        this.service = service;
    }

    @Override
    public void execute() {

    }
}

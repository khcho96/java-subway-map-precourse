package subway.command.main.impl;

import subway.command.Command;
import subway.command.line.LineMenuCommandRegistry;
import subway.service.SubwayService;
import subway.view.OutputView;

public class LineCommand implements Command {

    private final SubwayService service;
    private final LineMenuCommandRegistry lineRegistry;

    public LineCommand(SubwayService service, LineMenuCommandRegistry lineRegistry) {
        this.service = service;
        this.lineRegistry = lineRegistry;
    }

    @Override
    public void execute() {

    }
}

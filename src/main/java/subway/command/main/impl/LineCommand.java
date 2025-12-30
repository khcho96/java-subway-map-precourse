package subway.command.main.impl;

import subway.command.Command;
import subway.command.line.LineMenuCommandRegistry;
import subway.command.line.LineMenuOption;
import subway.command.station.StationMenuOption;
import subway.service.SubwayService;
import subway.util.Retry;
import subway.view.InputView;
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
        LineMenuOption option = getOption();

        if (option.equals(LineMenuOption.BACK)) {
            return;
        }

        lineRegistry.execute(option);
    }

    private static LineMenuOption getOption() {
        return Retry.retryUntilSuccess(() -> {
            String selection = InputView.readLineMenuSelection();
            return LineMenuOption.from(selection);
        });
    }
}

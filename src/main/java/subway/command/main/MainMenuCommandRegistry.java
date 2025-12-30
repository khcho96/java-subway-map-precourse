package subway.command.main;

import java.util.EnumMap;
import subway.command.Command;
import subway.command.main.impl.LineCommand;
import subway.command.main.impl.RouteCommand;
import subway.command.main.impl.SectionCommand;
import subway.command.main.impl.StationCommand;
import subway.service.SubwayService;

public class MainMenuCommandRegistry {

    private final EnumMap<MainMenuOption, Command> commands;

    private MainMenuCommandRegistry(EnumMap<MainMenuOption, Command> commands) {
        this.commands = commands;
    }

    public static MainMenuCommandRegistry from(SubwayService service) {
        EnumMap<MainMenuOption, Command> map = new EnumMap<>(MainMenuOption.class);
        map.put(MainMenuOption.A, new StationCommand(service));
        map.put(MainMenuOption.B, new LineCommand(service));
        map.put(MainMenuOption.C, new SectionCommand(service));
        map.put(MainMenuOption.D, new RouteCommand(service));
        return new MainMenuCommandRegistry(map);
    }

    public void execute(MainMenuOption option) {
        commands.get(option).execute();
    }
}

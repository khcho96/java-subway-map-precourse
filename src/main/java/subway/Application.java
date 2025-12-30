package subway;

import java.util.Scanner;
import subway.command.line.LineMenuCommandRegistry;
import subway.command.main.MainMenuCommandRegistry;
import subway.command.section.SectionMenuCommandRegistry;
import subway.command.station.StationMenuCommandRegistry;
import subway.controller.SubwayController;
import subway.service.SubwayService;

public class Application {
    public static void main(String[] args) {
        SubwayService service = new SubwayService();
        MainMenuCommandRegistry mainRegistry = MainMenuCommandRegistry.from(service);
        StationMenuCommandRegistry stationRegistry = StationMenuCommandRegistry.from(service);
        LineMenuCommandRegistry lineRegistry = LineMenuCommandRegistry.from(service);
        SectionMenuCommandRegistry sectionRegistry = SectionMenuCommandRegistry.from(service);
        SubwayController controller = new SubwayController(mainRegistry, stationRegistry, lineRegistry, sectionRegistry, service);
        controller.run();
    }
}

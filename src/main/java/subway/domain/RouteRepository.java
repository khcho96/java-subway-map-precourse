package subway.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RouteRepository {

    private static final Map<Line, List<Station>> routes = new HashMap<>();

    public static void addLine(Line line, List<Station> stations) {
        routes.put(line, stations);
    }
}

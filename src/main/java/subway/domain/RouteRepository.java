package subway.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import subway.constant.ErrorMessage;

public class RouteRepository {

    private static final Map<Line, List<Station>> routes = new HashMap<>();

    public static void addStations(Line line, List<Station> stations) {
        if (routes.containsKey(line)) {
            throw new IllegalArgumentException(ErrorMessage.ALREADY_EXIST_LINE.getErrorMessage());
        }
        routes.put(line, stations);
    }

    public static void addLine(Line line) {
        if (routes.containsKey(line)) {
            throw new IllegalArgumentException(ErrorMessage.ALREADY_EXIST_LINE.getErrorMessage());
        }
        routes.put(line, new ArrayList<>());
    }

    public static boolean contains(Station station) {
        for (List<Station> value : routes.values()) {
            if (value.contains(station)) {
                return true;
            }
        }
        return false;
    }

    public static void addStation(Line line, Station station) {
        List<Station> stations = routes.get(line);
        if (stations.contains(station)) {
            throw new IllegalArgumentException(ErrorMessage.ALREADY_EXIST_STATION_IN_LINE.getErrorMessage());
        }
        stations.add(station);
    }

    public static void addStation(Line line, Station station, int index) {
        List<Station> stations = routes.get(line);
        if (stations.contains(station)) {
            throw new IllegalArgumentException(ErrorMessage.ALREADY_EXIST_STATION_IN_LINE.getErrorMessage());
        }
        stations.add(index - 1, station);
    }
}

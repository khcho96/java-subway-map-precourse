package subway.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public final class InputParser {

    private InputParser() {
    }

    public static String parseStation(String station) {
        station = station.strip();

        Validator.validateStationFormat(station);
        return station;
    }
}

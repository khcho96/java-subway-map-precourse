package subway.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.RouteRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

public class SubwayService {

    public void setStations(List<String> stations) {
        for (String stationName : stations) {
            StationRepository.addStation(Station.from(stationName));
        }
    }

    public void setLines(Map<String, List<String>> lines) {
        for (String lineName : lines.keySet()) {
            Line line = Line.from(lineName);
            LineRepository.addLine(line);

            List<Station> stations = new ArrayList<>();
            for (String stationName : lines.get(lineName)) {
                stations.add(StationRepository.getStation(stationName));
            }
            RouteRepository.addLine(line, stations);
        }
    }

    public void registerStation(String stationName) {
        StationRepository.addStation(Station.from(stationName));
    }

    public void deleteStation(String stationName) {
        Station station = StationRepository.getStation(stationName);
        StationRepository.deleteStation(station);
    }

    public List<String> getStations() {
        return StationRepository.stations().stream()
                .map(Station::getName)
                .toList();
    }

    // 도메인 객체 인스턴스 변수로 저장

    // 메서드
}

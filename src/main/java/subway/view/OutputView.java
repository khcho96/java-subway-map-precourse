package subway.view;

import java.util.List;

public class OutputView {

    private OutputView() {
    }

    public static void printRegistration(String name) {
        System.out.printf("\n[INFO] %s이 등록되었습니다.\n", name);
    }

    public static void printDelete(String name) {
        System.out.printf("\n[INFO] %s이 삭제되었습니다.\n", name);
    }

    public static void printStations(List<String> stations) {
        System.out.println("\n## 역 목록");
        for (String station : stations) {
            System.out.println("[INFO] " + station);
        }
    }

    public static void printLines() {

    }

    public static void printRoutes() {

    }

    public static void printErrorMessage(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}

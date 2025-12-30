package subway.view;

import subway.constant.Constant;

public class OutputView {

    private OutputView() {
    }

    public static void printRegistration(String name) {
        System.out.printf("\n[INFO] %s이 등록되었습니다.\n", name);
    }

    public static void printDelete(String name) {
        System.out.printf("\n[INFO] %s이 삭제되었습니다.\n", name);
    }

    public static void printStations() {

    }

    public static void printLines() {

    }

    public static void printRoutes() {

    }

    public static void printErrorMessage(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}

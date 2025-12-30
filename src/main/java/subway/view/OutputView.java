package subway.view;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class OutputView {

    private OutputView() {
    }

    public static void printRegistration(String name) {
        System.out.printf("\n[INFO] %s이 등록되었습니다.\n", name);
    }

    public static void printDelete() {

    }

    public static void printQuery() {

    }

    public static void printErrorMessage(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}

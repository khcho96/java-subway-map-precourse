package subway.view;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class OutputView {

    private OutputView() {
    }

    public static void printRegistration() {

    }

    public static void printDelete() {

    }

    public static void printQuery() {

    }

    public static void printErrorMessage(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}

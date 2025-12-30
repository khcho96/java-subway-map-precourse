package subway.util;

public final class Validator {

    private static final String NUMBER_FORMAT = "\\d+";

    private Validator() {}

    public static void validateXxx(String input) {
        input = input.strip();
    }

    public static void validateCsvFormat(String input) {
        input = input.strip();
    }
}

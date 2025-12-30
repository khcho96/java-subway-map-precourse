package subway.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public final class InputParser {

    private InputParser() {
    }

    public static Integer parseXxx(String rawInput) {
        rawInput = rawInput.strip();

        return NumberConvertor.convertToNumber(rawInput);
    }
}

package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import subway.constant.ErrorMessage;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<>();

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        if (lines().contains(line)) {
            throw new IllegalArgumentException(ErrorMessage.ALREADY_EXIST_LINE.getErrorMessage());
        }
        lines.add(line);
    }

    public static void deleteLine(Line deletedLine) {

        lines.removeIf(line -> line.equals(deletedLine));
    }
}

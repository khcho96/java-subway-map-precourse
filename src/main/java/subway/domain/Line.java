package subway.domain;

import java.util.Objects;
import subway.constant.ErrorMessage;

public class Line {
    private final String name;

    public Line(String name) {
        this.name = name;
    }

    public static Line from(String name) {
        validate(name);
        return new Line(name);
    }

    private static void validate(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException(ErrorMessage.LINE_NAME_SIZE_ERROR.getErrorMessage());
        }
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Line line = (Line) object;
        return Objects.equals(name, line.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

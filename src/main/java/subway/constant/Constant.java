package subway.constant;

import java.util.Arrays;

public enum Constant {

    NAME(1, ""),
    ;

    private final int x1;
    private final String x2;

    Constant(int x1, String x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    /*public static Constant fromX1(int x1) {
        return Arrays.stream(values())
                .filter(constant -> constant.x1 == x1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage..getErrorMessage()));
    }

    public static Constant fromX2(String x2) {
        return Arrays.stream(values())
                .filter(constant -> constant.x2.equals(x2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage..getErrorMessage()));
    }*/
}

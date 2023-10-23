package baseball.util;

public class ExceptionHandler {
    public void throwIfNumberLengthNotThree() {
        throw new IllegalArgumentException("숫자의 길이는 3이어야 합니다.");
    }

    public void throwIfNumberHasZero() {
        throw new IllegalArgumentException("0이 포함되면 안됩니다.");
    }

    public void throwIfNumberIsDuplicated() {
        throw new IllegalArgumentException("중복되는 숫자가 들어가면 안됩니다.");
    }

    public void throwIfStringIsNotNumeric() {
        throw new IllegalArgumentException("숫자를 제외한 값들은 들어가면 안됩니다.");

    }
}

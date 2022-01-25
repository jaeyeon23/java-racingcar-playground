package car;

public class ValidationUtil {
    private static final int STRING_LENGTH = 5;

    public boolean isLength(String name) {
        if (name.length() > STRING_LENGTH) {
            return false;
        }
        return true;
    }
}

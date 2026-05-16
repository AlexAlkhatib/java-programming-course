package exceptions;

public class CheckedVsUnchecked {
    public static void validateString(String s) throws EmptyStringException {
        if (s.isEmpty()) {
            throw new EmptyStringException("Cannot proceed an empty string");
        }
    }
}
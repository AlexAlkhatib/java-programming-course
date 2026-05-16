package exceptions;

public class ThrowingExceptions {
    
    public static void validateNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed!");
        }
    }
}
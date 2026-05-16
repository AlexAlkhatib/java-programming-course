package exceptions;

public class ThrowingExceptions {
    public static void main(String[] args) {
        try {
            validateNumber(-5); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static void validateNumber(int number) {
        if (number >= 0) {
            System.out.println("The number is valid");
        }
        else {
            throw new IllegalArgumentException("Negative numbers are not allowed!");
        }
    }
}
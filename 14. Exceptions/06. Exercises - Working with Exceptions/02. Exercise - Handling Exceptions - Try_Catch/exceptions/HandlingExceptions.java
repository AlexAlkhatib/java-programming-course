package exceptions;

public class HandlingExceptions {
    public static void main(String[] args) {
        try {
            ThrowingExceptions.validateNumber(-5);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
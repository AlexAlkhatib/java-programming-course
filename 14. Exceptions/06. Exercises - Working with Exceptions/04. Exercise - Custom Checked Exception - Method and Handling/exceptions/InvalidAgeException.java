package exceptions;

public class InvalidAgeException extends Exception {
    // no args
    public InvalidAgeException() {
        super();
    }

    // message arg
    public InvalidAgeException(String message) {
        super(message);
    }

    // exception arg
    public InvalidAgeException(Exception e) {
        super(e);
    }
}
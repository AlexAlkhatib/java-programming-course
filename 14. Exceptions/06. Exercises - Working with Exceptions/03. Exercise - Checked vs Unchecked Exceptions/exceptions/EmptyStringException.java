package exceptions;

public class EmptyStringException extends Exception {
    // no args
    public EmptyStringException() {
        super();
    }

    // error message arg
    public EmptyStringException(String message) {
        super(message);
    }

    // exception arg
    public EmptyStringException(Exception e) {
        super(e);
    }
}
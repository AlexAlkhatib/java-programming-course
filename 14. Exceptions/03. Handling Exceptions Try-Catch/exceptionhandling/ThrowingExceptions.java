package exceptionhandling;

import java.io.IOException;

public class ThrowingExceptions {
    public static void main(String[] args) throws IOException {
        // 1. try catch
        // 2. add it to the method signature
        divide(5, 0);
    }

    public static void divide(int a, int b) throws IOException {
        if (b == 0) {
            throw new IOException("Cannot divide by zero!");
        }
        System.out.println(a / b);
    }
}
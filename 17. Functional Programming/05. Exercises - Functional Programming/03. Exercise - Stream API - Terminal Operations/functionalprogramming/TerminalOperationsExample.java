package functionalprogramming;

import java.util.List;
import java.util.Arrays;

public class TerminalOperationsExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 5, 6, 8, 9, 10);

        // Count the number of even numbers
        long lengthOfEvenNumbers = numbers.stream()
                                        .filter(n -> n % 2 == 0)
                                        .count();

        System.out.println("Size of even Numbers: " + lengthOfEvenNumbers);
    }
}
package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 7, 15, 3, 60, 22);
        Stream<Integer> oddNumbers = numbers.stream().filter(number -> number % 2 != 0);
        // convert the stream into a lsit: stream.collect(Collectors.toList());
        Stream<Integer> squareNumbers = oddNumbers.collect(Collectors.toList()).stream().map(number -> number * number);
        List<Integer> result = squareNumbers.collect(Collectors.toList());
        System.out.println("Squared Odd Numbers: " + result);
    }
}
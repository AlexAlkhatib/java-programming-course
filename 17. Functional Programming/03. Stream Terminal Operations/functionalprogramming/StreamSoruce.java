package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSoruce {
    public static void main(String[] args) {
        // Creating a stream from a collection
        List<String> names = Arrays.asList("Alex", "Bob", "Charlie");
        Stream<String> namesStream = names.stream();

        // Creating a stream from an array
        String[] namesArray = {"Alex", "Bob", "Charlie"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);

        // Creating a stream using the Stream.iterate() method
        // increase the value by 1 infinitly
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);

        // Creating a stream using the Stream.generate() method
        Stream<Double> randomNumbersStream = Stream.generate(Math::random);
    }
}
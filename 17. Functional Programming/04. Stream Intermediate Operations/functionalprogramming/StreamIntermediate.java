package functionalprogramming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediate {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "Bob", "Charlie");
        
        // filter: filters the stream based on a predicate
        Stream<String> namesStartingWithA = names.stream().filter(name -> name.startsWith("A"));

        // map: applies a function to each element in the stream
        Stream<Integer> namesLength = names.stream().map(String::length);

        // flatMap: applies a function to each element in the stream and flattens the resulting streams into a single stream
        List<List<String>> nestedNames = Arrays.asList(Arrays.asList("Alice", "Bob"), Arrays.asList("Charlie", "Danny"));
        Stream<String> flatNames = nestedNames.stream().flatMap(Collection::stream);

        // peek: performs an action on each element in the stream without modifying the stream
        Stream<String> namesWithPeek = names.stream().peek(System.out::println);

        // limit: limits the stream to a certain number of elements
        Stream<String> firstThreeNames = names.stream().limit(3);

        // skip: skip the first N elements in the stream
        Stream<String> skipNames = names.stream().skip(1);

        // distinct: remove duplicate elements from the stream
        Stream<String> distinctNames = names.stream().distinct();

        // sorted: sorts the elements in the stream according to a comparator
        Stream<String> sortedNames = names.stream().sorted(Comparator.naturalOrder());
    }
}
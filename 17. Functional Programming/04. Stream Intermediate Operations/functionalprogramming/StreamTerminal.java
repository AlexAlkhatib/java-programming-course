package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminal {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "Bob", "Charlie");
        Stream<String> namesStream = names.stream();

        // foreach performs an action for every element in the stream
        namesStream.forEach(System.out::println); // print every element

        // count: returns the number of elements in the stream
        long numberOfItems = names.stream().count(); // 3

        // min, max: returns the minimum or the maximum elements in the stream
        Optional<String> min = names.stream().min((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(min.get()); // Alex (comes first alphabatically)

        // allmatch: check if all the elements in the stream match a given predicate
        boolean allBiggerThan5 = names.stream().allMatch(s -> s.length() > 5);
        System.out.println("All bigger than 5: " + allBiggerThan5); // false

        // anymatch: check if atleast one element in the stream match the given predicate
        boolean anyBiggerThan5 = names.stream().anyMatch(s -> s.length() > 5);
        System.out.println("Any bigger than 5: " + anyBiggerThan5); // true

        // nonematch: check if none element in the stream match the given predicate
        boolean noneBiggerThan5 = names.stream().noneMatch(s -> s.length() > 5);
        System.out.println("None bigger than 5: " + noneBiggerThan5); // false

        // collect: transforms the stream into a different data structure, such as a List, Set, Map
        List<String> namesList = names.stream().collect(Collectors.toList());

        // reduce: applies a binary operator to the elements in the stream, reducing them into a single value
        Optional<String> totalString = names.stream().reduce(String::concat);
        System.out.println(totalString.get()); // AlexBobCharlie
    }
}
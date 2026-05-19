package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Alex", "Bob", "Charlie");
        strings.forEach(string -> System.out.println(string));
    }
}

/*
    for (String s : strings) {
        System.out.println(s);
    }
*/
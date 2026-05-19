package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "functional, programming");
        List<String> uppercaseStrings = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        
        System.out.println("Uppercase Strings: " + uppercaseStrings);
    }
}
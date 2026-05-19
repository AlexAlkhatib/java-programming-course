package functionalprogramming;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleMethodReferences {
    public static void main(String[] args) {
        // reference to a static method (lambda way)
        Function<Integer, String> nrToHexString = i -> Integer.toHexString(i);

        // method reference way
        Function<Integer, String> nrToHexStringMethodReference = Integer::toHexString;
        String result = nrToHexStringMethodReference.apply(256);
        System.out.println(result); // 100

        // reference to an instance method
        String prefix = "Hello ";
        Function<String, String> greet = s -> prefix + s;
        // greet.apply("Alex");

        Function<String, String> greetMethodReference = prefix::concat;
        System.out.println(greetMethodReference.apply("Alex")); // Hello Alex

        // two inputs
        BiFunction<String, String, Integer> stringComparator = (s1, s2) -> s1.compareToIgnoreCase(s2);
        BiFunction<String, String, Integer> stringComparatorMethodReference = String::compareToIgnoreCase;
        int equal = stringComparatorMethodReference.apply("hello", "Hello"); // 0

        // reference to a constructor
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        ArrayList<String> names = listSupplier.get();
        names.add("Alex");
        System.out.println(names.get(0)); // Alex
    }
}
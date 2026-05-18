package lambdaexpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleBuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        SupplierExample se = new SupplierExample();
        String msg1 = se.get(); // return Hello!

        Supplier<String> s1 = () -> "Hello!";
        String msg2 = s1.get(); // return Hello!

        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Hello from Consumer!"); // print a message

        Predicate<String> p1 = s -> s.length() < 5;
        boolean test = p1.test("Hi!"); // true

        Function<String, Integer> f1 = s -> s.length();
        int length = f1.apply("Hello"); // 5
    }
}
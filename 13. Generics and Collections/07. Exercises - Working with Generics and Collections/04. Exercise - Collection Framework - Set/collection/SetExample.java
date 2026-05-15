package collection;

import java.util.Set;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1000);
        numbers.add(100);
        numbers.add(1000);
    }
}
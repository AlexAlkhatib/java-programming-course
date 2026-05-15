package sets;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(10);
        integerSet.add(100);
        integerSet.add(10); // will not be added

        System.out.println(integerSet); // [1, 100, 10]

        for(Integer i : integerSet) {
            System.out.println(i);
            // 1
            // 100
            // 10
        }
    }
}

/* The set is unordered and the elements don't have an index */
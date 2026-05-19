package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class MaximumValueExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        int maximumValue = integers.stream().reduce(0, Integer::max);
        System.out.println("Maximum value: " + maximumValue); // 9
    }
}

/*
    My solution is much simpler
*/
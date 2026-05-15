package queues;

import java.util.ArrayDeque;
import java.util.Deque;
// import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        // Queue<String> strings = new ArrayDeque<>();
        Deque<String> strings = new ArrayDeque<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C#");

        System.out.println(strings); // [Java, Python, C#]
        strings.pop();
        System.out.println(strings); // [Python, C#]
        strings.addFirst("Java");
        System.out.println(strings); // [Java, Python, C#]
        strings.addLast("Rust");
        System.out.println(strings); // [Java, Python, C#, Rust]
        System.out.println(strings.peek()); // Java
        System.out.println(strings); // [Java, Python, C#, Rust]
        strings.push("C");
        System.out.println(strings); // [C, Java, Python, C#, Rust]
        System.out.println(strings.pollLast()); // Rust
        System.out.println(strings); // [C, Java, Python, C#]
    }
}
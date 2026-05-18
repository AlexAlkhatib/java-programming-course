package lambdaexpressions;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = (x, y) -> x + y;
        Calculator c2 = (x, y) -> x - y;
        
        System.out.println("Sum: " + c1.calculate(3, 2)); // 5
        System.out.println("Substraction: " + c2.calculate(3, 2)); // 1

        Calculator c3 = (x, y) -> {
            System.out.println("Hello from the lambda expression");
            return x * y;
        };
        System.out.println("Multiplication: " + c3.calculate(3, 2)); 
        // Hello from the lambda expression
        // 6

        Printer p1 = s -> System.out.println("Printer says: " + s);
        p1.print("Hello!"); // Printer says: Hello!

        NumberProvider np1 = () -> 5;
        System.out.println(np1.provid()); // 5
    }
}
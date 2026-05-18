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

        int result1 = execute(3, 2, c1); // 5
        int result2 = execute(3, 2, c2); // 1
        int result3 = execute(3, 2, c3); // 6
        int result4 = execute(3, 2, new CalculatorImpl()); // 1
        int result5 = execute(3, 2, (x, y) -> x / y); // 1

        System.out.println(result1 + " " + result2 + " " + result3 + " " + result4 + " " + result5);
    }

    public static int execute(int number1, int number2, Calculator calculator) {
        return calculator.calculate(number1, number2);
    }
}
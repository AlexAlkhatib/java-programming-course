package lambda;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator addition = (a, b) -> a + b;
        int sum = addition.operate(3, 2);
        System.out.println("Sum: " + sum); // 5
    }
}
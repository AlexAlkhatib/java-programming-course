package lambda;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator maximum = (a, b) -> (a > b) ? a : b;
        int max = maximum.operate(7, 5);
        System.out.println("Maximum Number: " + max); // 7
    }
}
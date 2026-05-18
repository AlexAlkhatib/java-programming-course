package lambdaexpressions;

public class LambdaScopeExample {
    public static void main(String[] args) {
        int localVar = 7;
        Calculator calculator = (a, b) -> a * b + localVar;
        int result = calculator.calculate(2, 1); 
        System.out.println(result); // 10

        // Scope Problem
        // Calculator calculator = (localVar, b) -> localVar * b + localVar;
    }
}
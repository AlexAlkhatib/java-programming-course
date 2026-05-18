package lambda;

public class LambdaExample {
    public static void main(String[] args) {
        StringFormatter toUpperCase = s -> s.toUpperCase();
        String upperCaseString = toUpperCase.format("alex");
        System.out.println("UpperCase: " + upperCaseString); // ALEX
    }
}
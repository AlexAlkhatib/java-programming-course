package controlflow;

public class ExamplesWhile {
    public static void main(String[] args) {
        // Example 1
        boolean notFound = true;
        while (notFound) {
            // Math.random() * 10: 0 - 9 
            // + 1: 1 - 10 OR * 11
            int randomNumber = (int) (Math.random() * 10) + 1; 
            System.out.println("Value: " + randomNumber);
            if (randomNumber == 10) {
                notFound = false;
            }
        }
        // Example 2
        int i = 0;
        while (i < 100) {
            System.out.println(Math.pow(i, 2));
            i++;
        }
    }
}
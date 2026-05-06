public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // For loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }
        // Foreach Loop
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
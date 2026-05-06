public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
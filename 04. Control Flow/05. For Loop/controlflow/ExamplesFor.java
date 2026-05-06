package controlflow;

public class ExamplesFor {
    public static void main(String[] args) {
        // Example 1
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int search = 7;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                index = i;
            }
        }
        System.out.println(index);

        // Example 2
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }
}
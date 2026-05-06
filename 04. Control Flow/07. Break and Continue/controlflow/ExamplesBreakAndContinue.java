package controlflow;

public class ExamplesBreakAndContinue {
    public static void main(String[] args) {
        // Break
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 10};
        int search = 7;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                index = i;
                break;
            }
        }
        System.out.println(index);

        // CONTINUE
        int[] nrs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int nr : nrs) {
            if (nr % 2 == 0) {
                continue;
            }
            System.out.println(nr);
        }
    }
}

/*
    Same result cleaner code
        int[] nrs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int nr : nrs) {
            if (nr % 2 != 0) {
                System.out.println(nr);
            }
        }
*/
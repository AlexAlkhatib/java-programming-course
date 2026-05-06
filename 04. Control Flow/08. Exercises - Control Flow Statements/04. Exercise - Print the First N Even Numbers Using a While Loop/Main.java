public class Main {
    public static void main(String[] args) {
        int n = 10;
        int counter = 0;

        while (counter <= n) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
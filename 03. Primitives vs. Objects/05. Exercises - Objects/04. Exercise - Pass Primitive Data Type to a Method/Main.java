public class Main {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Before: " + number); // 5
        modifyNumber(number);
        System.out.println("After: " + number); // 5
    }

    private static void modifyNumber(int number) {
        number = number * 2;
    }
}
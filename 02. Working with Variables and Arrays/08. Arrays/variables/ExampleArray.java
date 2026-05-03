public class ExampleArray {
    public static void main(String[] args) {
        int [] intArr = {1, 2, 3, 4, 5};
        System.out.println(intArr[0]); // 1
        intArr[4] = 10; // {1, 2, 3, 4, 10}
        System.out.println(intArr[4]); // 10

        System.out.println(intArr.toString()); // {1, 2, 3, 4, 10}
        System.out.println(intArr.length); // 4
    }
}
public class ExampleOperators {
    public static void main(String[] args) {
        // arithmetic operators
        double x = 2;
        double y = 3;
        double z = x + y;

        System.out.println(z);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y); // double to print the actual result

        int n1 = 10;
        int n2 = 4;
        int result = n1 % n2;
        System.out.println("Modulus: " + result); // 2
    }
}
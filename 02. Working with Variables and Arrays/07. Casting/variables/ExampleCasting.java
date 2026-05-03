public class ExampleCasting {
    public static void main(String[] args) {
        long l = 123;
        int i = (int) l;

        double d = 3.14;
        float f = (float) d;

        // This will be a problem
        byte b = -23;
        char c = (char) b;
        System.out.println(c); // <-
        int n = c;
        System.out.println(n); // 65513

        char maxChar = 65535;
        char newChar = (char) (maxChar + 1); // 0
        // System.out.println((int) newChar); // 0
    }
}
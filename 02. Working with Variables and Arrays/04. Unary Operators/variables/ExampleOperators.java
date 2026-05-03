public class ExampleOperators {
    public static void main(String[] args) {
        // unary operators
        int n1 = 8;
        n1++;
        System.out.println(n1); // 9
        n--;
        System.out.println(n1); // 8

        int n2 = 6;
        System.out.println(-n2); // -6
        System.out.println(n2); // 6

        int pre = 5;
        int post = 5;
        System.out.println(++pre); // 6
        System.out.println(post++); // 5
        System.out.println("Post: " + post); // 6
        System.out.println("Pre: " + pre); // 6
    }
}
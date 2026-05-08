package staticmodifier;

public class Main {
    public static void main(String[] args) {
        // #1
        System.out.println("PI: " + MathUtils.pi);
        double result = MathUtils.substract(10, 5);
        System.out.println(result);

        // #2
        MathUtils m = new MathUtils();
        System.out.println(m.pi);
        System.out.println(m.substract(10, 5));

        MathUtils m1 = new MathUtils();
        m1.pi = 15;
        // 15 15 15
        System.out.println(m.pi + " " + MathUtils.pi + " " + m1.pi);
    }
}

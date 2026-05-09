package workingwithstrings;

public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "Hi";
        String s2 = s1;

        System.out.println(s1 + " " + s2); // Hi Hi
        s1 = "Hello";
        System.out.println(s1 + " " + s2); // Hello Hi

        Text t1 = new Text();
        t1.setDescription("Hi");
        Text t2 = t1;

        System.out.println(t1 + " " + t2); // Hi Hi
        t1.setDescription("Hello");
        System.out.println(t1 + " " + t2); // Hello Hello
    }
}
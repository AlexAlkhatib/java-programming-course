package accessmodifiers;

public class Person {
    String name;
    private String secret;

    void sayHi() {
        System.out.println("Hello, I'm " + name);
    }

    private void tellSecret() {
        System.out.println("The secret is " + secret);
    }
}
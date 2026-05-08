package accessmodifiers;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alex";
        person.sayHi();
        person.secret = "We can't";
        person.tellSecret();
    }
}
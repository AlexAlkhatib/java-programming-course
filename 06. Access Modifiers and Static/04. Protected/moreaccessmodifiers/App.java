package moreaccessmodifiers;

import accessmodifiers.Person;

public class App extends Person {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alex";
        p.sayHi();
    }

    public void greeting() {
        name = "Alex";
        sayHi();
    }
}
package primitivevsobject;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = person1;

        person1.name = "Alex";

        System.out.println(person2.name); // Alex
    }
}

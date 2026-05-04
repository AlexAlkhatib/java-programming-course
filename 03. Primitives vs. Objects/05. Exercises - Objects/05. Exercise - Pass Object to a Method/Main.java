public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alex";
        person.age = 27;
        System.out.println("Before: ");
        // Alex, 27
        System.out.println("name: " + person.name + ", age: " + person.age);
        modifyPerson(person);
        System.out.println("After: ");
        // Alexander, 28
        System.out.println("name: " + person.name + ", age: " + person.age);
    }

    private static void modifyPerson(Person person) {
        person.name = "Alexander";
        person.age = 28;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        String name = person.name;
        int age = person.age; // Cannot be accessed
        String address = person.address;
        String ssn = person.ssn;
    }
}
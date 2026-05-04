public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Car car = new Car();

        person.name = "Alex";
        car.model = "BMW";
        car.owner = person;

        System.out.println("Car's model: " + car.model);
        System.out.println("Car's owner: " + car.owner.name);
    }
}

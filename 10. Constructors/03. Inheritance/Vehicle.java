public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
        System.out.println("In vehicle constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
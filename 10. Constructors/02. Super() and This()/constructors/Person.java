package constructors;

public class Person {
    private String name;

    // custom constructor
    public Person(String name) {
        this.name = name;
    }

    // default constructor
    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
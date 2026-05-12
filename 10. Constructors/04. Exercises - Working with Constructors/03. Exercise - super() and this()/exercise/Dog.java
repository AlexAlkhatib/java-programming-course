package exercise;

public class Dog extends Animal {
    private String breed;

    public Dog(String breed, String species, int age) {
        super(species, age);
        this.breed = breed;
    }

    public Dog() {
        this("Unknown", "Dog", 5);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

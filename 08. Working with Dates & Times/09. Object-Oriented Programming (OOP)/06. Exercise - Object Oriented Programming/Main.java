public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Roar");
        Bird bird = new Bird();
        Parrot parrot = new Parrot();

        animal.makeSound(); // Roar
        bird.makeSound(); // Chirp
        parrot.makeSound(); // Squawk
    }
}
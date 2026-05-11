package oop;

public class App {
    public static void main(String[] args) {
        // Animal cat = new Cat(); -> only the methods from animal are available
        // ((Cat) cat).meow()
        // ((Dog) dog).bark()
        
        Cat cat = new Cat();
        Dog dog  = new Dog();
        
        cat.eat(); // Cat is eating
        dog.eat(); // Dog is eating
    }
}
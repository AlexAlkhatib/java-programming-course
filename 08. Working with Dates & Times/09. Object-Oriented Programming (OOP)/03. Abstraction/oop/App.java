package oop;

public class App {
    public static void main(String[] args) {
        // We cannot instanciate an abstract class
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog  = new Dog();
        
        cat.eat();
        dog.eat();
    }
}
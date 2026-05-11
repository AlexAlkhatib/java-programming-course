package oop;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog  = new Dog();
        
        cat.eat(); // Cat is eating
        dog.eat(); // Dog is eating
        dog.eat("meat"); // Dog is eating meat

        // hiding
        System.out.println(Cat.type); // Cat
        System.out.println(Dog.type); // Dog
    }
}
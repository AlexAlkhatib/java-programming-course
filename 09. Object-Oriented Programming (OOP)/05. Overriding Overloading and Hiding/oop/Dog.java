package oop;

public class Dog extends Animal {
    public static String type = "Dog";

    // Without @Override key word we can also Overrride but we wll not be worried about the method signature
    /* 
    @Override
    public void eat(String food) {
        System.out.println("Dog is eating");
    }
    */

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    // this is overloading
    public void eat(String food) {
        System.out.println("Dog is eating " + food);
    }

    public void bark() {
        System.out.println("woof woof");
    }
}
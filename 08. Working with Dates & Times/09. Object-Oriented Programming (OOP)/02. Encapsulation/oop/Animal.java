package oop;

public class Animal {
    // private attributes
    private String name;
    private int age;
    private int numberOfEyes;

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
        {
            this.age = age;
        }
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    
    public void eat() {
        System.out.println("Animal eating");
    }
}
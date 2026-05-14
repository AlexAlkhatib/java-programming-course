package interfaces;

// this class can no longer be instantiated because it is an abstract class
public abstract class Animal {
    private double weight;

    public void eat() {
        System.out.println("Animal eating");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // an abstract methof can only exist in an abstract class
    public abstract void breathe();
}
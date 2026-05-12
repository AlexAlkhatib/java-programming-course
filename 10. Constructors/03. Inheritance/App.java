public class App {
    public static void main(String[] args) {
        Car c = new Car();
        // In vehicle constructor
        // In car constructor
        // The first call in constructor is always another constructor
        // Java adds super() when there is no constructor call explicitly
    }
}

/*
    FIX: add no args constructor or adjust the first call of the child class's constructor
*/
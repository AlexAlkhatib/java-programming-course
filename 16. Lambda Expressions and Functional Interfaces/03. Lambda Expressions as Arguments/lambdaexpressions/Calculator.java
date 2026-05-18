package lambdaexpressions;
/*
    Functional interfaces can have more than one method, but only one abstract method
*/
@FunctionalInterface
public interface Calculator {
    // abstract method
    int calculate(int a, int b);
    
    // we could add any other abstract method from the Object interface
    String toString();

    // implement method
    default void print() {
        System.out.println("hi");
    }
}
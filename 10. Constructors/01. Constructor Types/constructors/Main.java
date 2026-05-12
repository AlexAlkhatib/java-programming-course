package constructors;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alex", 27);
        
        // Name: null, Age: 0
        System.out.println("Student created with default constructor");
        System.out.println("Name: " + s1.getName() + ", Age: " + s1.getAge());

        // Name: Alex, Age: 27
        System.out.println("Student created with custom constructor");
        System.out.println("Name: " + s2.getName() + ", Age: " + s2.getAge());   
    }
}
package constructors;

public class Student {
    private String name;
    private int age;
    private String studentNumber;

    // default constrctor -> no args constructor
    public Student() {}

    // custom constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // another custom constructor
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

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
        this.age = age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
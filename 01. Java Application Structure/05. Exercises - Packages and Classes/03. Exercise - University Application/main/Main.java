package main;

import university.Student;
import university.Course;
import university.Enrollment;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(101);
        student.setName("John Doe");

        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("Introduction to Computer Science");

        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);

        System.out.println("Student ID: " + enrollment.getStudent().getStudentId() + ", Name: " + enrollment.getStudent().getName());
        System.out.println("Course ID: " + enrollment.getCourse().getCourseId() + ", Name: " + enrollment.getCourse().getCourseName());
    }
}
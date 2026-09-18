package com.example;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<String> students = new ArrayList<>();

    public static void addStudent(String name) {
        students.add(name);
    }

    public static List<String> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        addStudent("John Doe");
        addStudent("Jane Smith");
        System.out.println("Student Management System Started!");
        System.out.println("Student List: " + getStudents());
    }
}

package org.example.LAB_EST;

class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public Student() {}

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    int getRollNumber() {
        return this.rollNumber;
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return this.marks;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("abcd", 12345, 10);
        s1.setName("Sagen");
        s1.setRollNumber(12396);
        s1.setMarks(20);
        System.out.println(s1.getName());
        System.out.println(s1.getRollNumber());
        System.out.println(s1.getMarks());

        System.out.println(s2.getName());
        System.out.println(s2.getRollNumber());
        System.out.println(s2.getMarks());
    }
}


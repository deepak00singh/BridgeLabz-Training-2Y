package com.school.data;

public class Student {
    private String name;
    private double mark1, mark2, mark3;

    public Student(String name, double mark1, double mark2, double mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Getters
    public String getName() { return name; }
    public double getMark1() { return mark1; }
    public double getMark2() { return mark2; }
    public double getMark3() { return mark3; }

    @Override
    public String toString() {
        return "Student Name: " + name +
               "\nMarks: " + mark1 + ", " + mark2 + ", " + mark3;
    }
}

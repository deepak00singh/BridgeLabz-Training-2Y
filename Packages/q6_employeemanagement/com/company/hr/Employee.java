package com.company.hr;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    // Setter
    public void setSalary(double salary) { this.salary = salary; }

    public void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Name: " + name +
                           ", Department: " + department + ", Salary: " + salary);
    }
}

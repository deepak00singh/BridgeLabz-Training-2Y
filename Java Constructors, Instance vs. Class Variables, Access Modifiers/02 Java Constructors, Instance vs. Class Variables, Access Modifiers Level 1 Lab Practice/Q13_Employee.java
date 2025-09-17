class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private String level;

    public Manager(int employeeID, String department, double salary, String level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    public void display() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Level: " + level);
    }

    public static void main(String[] args) {
        Manager m = new Manager(1, "HR", 5000, "Senior");
        m.display();
    }
}
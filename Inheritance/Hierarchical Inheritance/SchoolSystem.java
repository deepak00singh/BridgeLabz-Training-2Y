// School System Hierarchical Inheritance Example
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student, Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff, Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alice", 35, "Mathematics");
        Student s1 = new Student("Bob", 16, "10th Grade");
        Staff st1 = new Staff("Charlie", 40, "Administration");

        t1.displayDetails();
        t1.displayRole();
        System.out.println("--------------------");

        s1.displayDetails();
        s1.displayRole();
        System.out.println("--------------------");

        st1.displayDetails();
        st1.displayRole();
    }
}

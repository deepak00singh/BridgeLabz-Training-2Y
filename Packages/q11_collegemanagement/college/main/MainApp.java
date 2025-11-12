package college.main;

// Import classes from other packages
import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;

// Static import example (using System.out.println directly)
import static java.lang.System.out;

public class MainApp {
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        // Create Faculties
        Faculty f1 = new Faculty("Dr. Smith", "Mathematics");
        Faculty f2 = new Faculty("Dr. Johnson", "Physics");

        // Create Departments
        Department d1 = new Department("Computer Science", 10);
        Department d2 = new Department("Mechanical", 20);

        // Display College Info
        out.println("===== College Information =====\n");

        out.println("Students:");
        s1.displayStudentInfo();
        s2.displayStudentInfo();

        out.println("\nFaculties:");
        f1.displayFacultyInfo();
        f2.displayFacultyInfo();

        out.println("\nDepartments:");
        d1.displayDepartmentInfo();
        d2.displayDepartmentInfo();
    }
}

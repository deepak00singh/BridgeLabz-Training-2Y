package college.faculty;

public class Faculty {
    private String name;
    private String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayFacultyInfo() {
        System.out.println("Faculty Name: " + name + ", Subject: " + subject);
    }
}

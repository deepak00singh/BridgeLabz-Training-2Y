import java.io.Serializable;

class StudentData implements Serializable {
    String name = "Devang";
    int age = 20;
}

public class BackupDemo {
    public static void main(String[] args) {
        StudentData s = new StudentData();
        System.out.println("Data marked for backup: " + s.name);
    }
}

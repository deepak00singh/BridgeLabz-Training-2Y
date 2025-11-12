package college.department;

public class Department {
    private String deptName;
    private int deptCode;

    public Department(String deptName, int deptCode) {
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + deptName + ", Code: " + deptCode);
    }
}

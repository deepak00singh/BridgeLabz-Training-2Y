import java.util.List;

abstract class JobRole { public abstract String getRoleName(); }
class SoftwareEngineer extends JobRole { public String getRoleName(){ return "Software Engineer"; } }
class DataScientist extends JobRole { public String getRoleName(){ return "Data Scientist"; } }
class ProductManager extends JobRole { public String getRoleName(){ return "Product Manager"; } }

class Resume<T extends JobRole> {
    private final String candidateName;
    private final T role;
    public Resume(String name, T role){ this.candidateName = name; this.role = role; }
    public String toString(){ return candidateName + " applying for " + role.getRoleName(); }
}

public class AiResumeScreeningSystem {
    public static void screenResumes(List<? extends JobRole> roles) {
        System.out.println("Screening roles:");
        for (JobRole r : roles) System.out.println(r.getRoleName());
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>("Alice", new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Bob", new DataScientist());

        System.out.println(r1);
        System.out.println(r2);

        // Use wildcard to pass different roles:
        List<JobRole> roleList = java.util.Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        screenResumes(roleList);
    }
}

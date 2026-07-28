import java.util.List;

abstract class CourseType { public abstract String getTypeName(); }
class ExamCourse extends CourseType { public String getTypeName(){ return "Exam-Based"; } }
class AssignmentCourse extends CourseType { public String getTypeName(){ return "Assignment-Based"; } }
class ResearchCourse extends CourseType { public String getTypeName(){ return "Research-Based"; } }

class Course<T extends CourseType> {
    private final String title;
    private final T type;
    public Course(String title, T type){ this.title = title; this.type = type; }
    public String toString(){ return title + " (" + type.getTypeName() + ")"; }
}

public class MutiLevelUniversityCourseManagementSystem {
    public static void printCourses(List<? extends CourseType> types) {
        for (CourseType t : types) System.out.println(t.getTypeName());
    }

    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Math 101", new ExamCourse());
        Course<AssignmentCourse> design = new Course<>("Design", new AssignmentCourse());
        Course<ResearchCourse> thesis = new Course<>("Thesis", new ResearchCourse());

        System.out.println(math);
        System.out.println(design);
        System.out.println(thesis);

        // Using wildcard to handle any CourseType:
        List<CourseType> allTypes = java.util.Arrays.asList(new ExamCourse(), new AssignmentCourse(), new ResearchCourse());
        printCourses(allTypes);
    }
}

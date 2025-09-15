import java.util.Random;

public class StudentGrades {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfStudents = 10;
        int[] grades = new int[numberOfStudents];
        int sum = 0;

        // Generate random grades between 0 and 100
        for (int i = 0; i < numberOfStudents; i++) {
            grades[i] = random.nextInt(101);
            sum += grades[i];
        }

        // Calculate average
        double average = (double) sum / numberOfStudents;

        // Find highest and lowest grades
        int highest = grades[0];
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        // Print results
        System.out.println("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println("\nAverage Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}

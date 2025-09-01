
import java.util.Scanner;
public class Q1_VoteEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age " + (i + 1) + ": ");
            if (!input.hasNextInt()) { System.err.println("Invalid input. Expected an integer age."); input.close(); return; }
            ages[i] = input.nextInt();
        }
        for (int age : ages) {
            if (age < 0) System.out.println("Invalid age: " + age);
            else if (age >= 18) System.out.println("The student with the age " + age + " can vote.");
            else System.out.println("The student with the age " + age + " cannot vote.");
        }
        input.close();
    }
}

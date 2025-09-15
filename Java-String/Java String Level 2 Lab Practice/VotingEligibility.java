import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfPeople = 10;
        int[] ages = new int[numberOfPeople];
        int eligibleCount = 0;

        // Generate random ages between 1 and 100
        for (int i = 0; i < numberOfPeople; i++) {
            ages[i] = random.nextInt(100) + 1; // Ages between 1 and 100
        }

        // Print ages and check voting eligibility
        System.out.println("Ages of the people:");
        for (int age : ages) {
            System.out.print(age + " ");
            if (age >= 18) {
                eligibleCount++;
            }
        }

        // Print the number of eligible voters
        System.out.println("\nNumber of people eligible to vote: " + eligibleCount);
        scanner.close();
    }
}

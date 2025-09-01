
import java.util.Scanner;
public class Q6_MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            while (!input.hasNextDouble()) { System.err.print("Invalid number. Try again: "); input.next(); }
            heights[i] = input.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.printf("Mean height of the football team = %.2f%n", mean);
        input.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class Problem1_NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;
        String response;
        while (true) {
            guess = random.nextInt(high - low + 1) + low;
            System.out.println("Computer guesses: " + guess);
            System.out.print("Enter feedback (high/low/correct): ");
            response = sc.next();
            if (response.equalsIgnoreCase("correct")) {
                System.out.println("Guessed correctly!");
                break;
            } else if (response.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (response.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }
}
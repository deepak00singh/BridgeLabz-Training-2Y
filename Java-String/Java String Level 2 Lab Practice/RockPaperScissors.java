import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        int userScore = 0;
        int computerScore = 0;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("First to 3 wins is the champion.");

        while (userScore < 3 && computerScore < 3) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            if (!isValidChoice(userChoice)) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            String computerChoice = choices[(int) (Math.random() * 3)];
            System.out.println("Computer chose: " + computerChoice);

            int roundResult = determineWinner(userChoice, computerChoice);
            if (roundResult == 1) {
                userScore++;
                System.out.println("You win this round!");
            } else if (roundResult == -1) {
                computerScore++;
                System.out.println("Computer wins this round!");
            } else {
                System.out.println("This round is a tie!");
            }

            System.out.println("Score - You: " + userScore + " | Computer: " + computerScore);
        }

        if (userScore == 3) {
            System.out.println("Congratulations! You are the champion!");
        } else {
            System.out.println("Computer is the champion! Better luck next time.");
        }

        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private static int determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return 0; // Tie
        }
        switch (userChoice) {
            case "rock":
                return (computerChoice.equals("scissors")) ? 1 : -1;
            case "paper":
                return (computerChoice.equals("rock")) ? 1 : -1;
            case "scissors":
                return (computerChoice.equals("paper")) ? 1 : -1;
            default:
                return 0; // Should never reach here
        }
    }
}

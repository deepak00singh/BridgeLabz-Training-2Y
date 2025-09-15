import java.util.Scanner;

public class WordsWithLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Split the input string into words based on spaces
        String[] words = input.split("\\s+");

        System.out.println("Words with their lengths:");
        for (String word : words) {
            System.out.println(word + ": " + word.length());
        }

        scanner.close();
    }
}

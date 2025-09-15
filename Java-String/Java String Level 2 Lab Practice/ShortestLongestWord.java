import java.util.Scanner;

public class ShortestLongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shortestWord = null;
        String longestWord = null;

        System.out.println("Enter words one by one. Type 'exit' to finish:");

        while (true) {
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }

            if (shortestWord == null || word.length() < shortestWord.length()) {
                shortestWord = word;
            }
            if (longestWord == null || word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        if (shortestWord != null && longestWord != null) {
            System.out.println("Shortest word: " + shortestWord);
            System.out.println("Longest word: " + longestWord);
        } else {
            System.out.println("No words were entered.");
        }

        scanner.close();
    }
}

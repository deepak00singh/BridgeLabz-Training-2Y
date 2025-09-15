import java.util.Scanner;

public class StringLengthWithoutLength {
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

            if (shortestWord == null || isShorter(word, shortestWord)) {
                shortestWord = word;
            }
            if (longestWord == null || isLonger(word, longestWord)) {
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

    private static boolean isShorter(String a, String b) {
        int countA = 0;
        for (char c : a.toCharArray()) {
            countA++;
        }
        int countB = 0;
        for (char c : b.toCharArray()) {
            countB++;
        }
        return countA < countB;
    }

    private static boolean isLonger(String a, String b) {
        int countA = 0;
        for (char c : a.toCharArray()) {
            countA++;
        }
        int countB = 0;
        for (char c : b.toCharArray()) {
            countB++;
        }
        return countA > countB;
    }
}

import java.util.*;

/**
 * Q5: Frequency using unique characters (calls uniqueChars first).
 */
public class FrequencyUsingUniqueChars {
    // Returns a string of unique characters in the order they appear
    public static String uniqueChars(String text) {
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : text.toCharArray()) {
            seen.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : seen) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static String[][] frequencyUsingUniqueChars(String text) {
        String uniqueChars = uniqueChars(text);
        int len = uniqueChars.length();
        String[][] frequencyTable = new String[len][2];

        for (int i = 0; i < len; i++) {
            char currentChar = uniqueChars.charAt(i);
            int count = 0;
            for (char c : text.toCharArray()) {
                if (c == currentChar) {
                    count++;
                }
            }
            frequencyTable[i][0] = String.valueOf(currentChar);
            frequencyTable[i][1] = String.valueOf(count);
        }

        return frequencyTable;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = frequencyUsingUniqueChars(input);

        System.out.println("Character Frequencies:");
        for (String[] entry : result) {
            System.out.println(entry[0] + ": " + entry[1]);
        }
        scanner.close();
    }
}
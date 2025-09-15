import java.util.*;

public class UniqueCharacters {
    public static String uniqueCharacters(String text) {
        StringBuilder uniqueChars = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char c : text.toCharArray()) {
            if (!seen.contains(c)) {
                uniqueChars.append(c);
                seen.add(c);
            }
        }
        return uniqueChars.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = uniqueCharacters(input);
        System.out.println("Unique characters: " + result);
        scanner.close();
    }
}
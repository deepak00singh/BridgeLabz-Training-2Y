import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the starting index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the ending index: ");
        int endIndex = scanner.nextInt();
        String substring = getSubstring(input, startIndex, endIndex);
        System.out.println("Substring: " + substring);
        scanner.close();
    }

    public static String getSubstring(String str, int start, int end) {
        if (start < 0 || end > str.length() || start > end) {
            return "Invalid indices";
        }
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}

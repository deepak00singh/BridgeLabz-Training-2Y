import java.util.Scanner;

public class ToLowerCustom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String lowerCaseString = toLowerCaseCustom(input);
        System.out.println("Lowercase: " + lowerCaseString);
        scanner.close();
    }

    public static String toLowerCaseCustom(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + ('a' - 'A')));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

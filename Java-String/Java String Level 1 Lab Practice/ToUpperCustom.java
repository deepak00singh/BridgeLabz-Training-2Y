import java.util.Scanner;

public class ToUpperCustom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String upperCaseString = toUpperCaseCustom(input);
        System.out.println("Uppercase: " + upperCaseString);
        scanner.close();
    }

    public static String toUpperCaseCustom(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - ('a' - 'A')));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

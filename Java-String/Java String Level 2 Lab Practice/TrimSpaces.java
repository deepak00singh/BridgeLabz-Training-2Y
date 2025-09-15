import java.util.Scanner;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = scanner.nextLine();

        // Trim leading and trailing spaces
        String trimmed = input.trim();

        System.out.println("Trimmed string: '" + trimmed + "'");
        scanner.close();
    }
}

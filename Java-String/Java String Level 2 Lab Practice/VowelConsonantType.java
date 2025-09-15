import java.util.Scanner;

public class VowelConsonantType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character:");
        String input = scanner.nextLine();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Please enter a valid single alphabetic character.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));
            if ("aeiou".indexOf(ch) != -1) {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        }

        scanner.close();
    }
}

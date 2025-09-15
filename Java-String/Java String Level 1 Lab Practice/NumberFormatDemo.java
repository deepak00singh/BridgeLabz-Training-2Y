import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered the number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + input + "' is not a valid integer.");
        }
        scanner.close();
    }
}

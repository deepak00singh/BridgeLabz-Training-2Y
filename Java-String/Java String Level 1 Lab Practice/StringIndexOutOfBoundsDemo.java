import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        try {
            char ch = input.charAt(index);
            System.out.println("Character at index " + index + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds for the string length " + input.length());
        }
        scanner.close();
    }
}

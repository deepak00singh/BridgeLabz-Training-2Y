import java.util.Scanner;

public class CharArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        boolean areEqual = true;
        if (charArray1.length != charArray2.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < charArray1.length; i++) {
                if (charArray1[i] != charArray2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }

        if (areEqual) {
            System.out.println("The character arrays are equal.");
        } else {
            System.out.println("The character arrays are not equal.");
        }

        scanner.close();
    }
}


import java.util.Scanner;
public class Q2_NumberClassification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            while (!input.hasNextInt()) { System.err.print("Invalid integer. Try again: "); input.next(); }
            arr[i] = input.nextInt();
        }
        for (int n : arr) {
            if (n > 0) System.out.println(n + (n % 2 == 0 ? " is positive and even." : " is positive and odd."));
            else if (n < 0) System.out.println(n + " is negative.");
            else System.out.println(n + " is zero.");
        }
        int first = arr[0], last = arr[arr.length - 1];
        if (first == last) System.out.println("The first and last elements are equal (" + first + ").");
        else if (first > last) System.out.println("The first element (" + first + ") is greater than the last element (" + last + ").");
        else System.out.println("The first element (" + first + ") is less than the last element (" + last + ").");
        input.close();
    }
}

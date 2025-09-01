
import java.util.Scanner;
public class Q8_FactorsWithDynamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        while (!input.hasNextInt()) { System.err.print("Invalid integer. Try again: "); input.next(); }
        int number = input.nextInt();
        if (number <= 0) { System.err.println("Error: Number must be positive."); input.close(); return; }
        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == factors.length) {
                    int[] temp = new int[factors.length * 2];
                    for (int j = 0; j < factors.length; j++) temp[j] = factors[j];
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) System.out.print(factors[i] + (i < index - 1 ? " " : ""));
        System.out.println();
        input.close();
    }
}

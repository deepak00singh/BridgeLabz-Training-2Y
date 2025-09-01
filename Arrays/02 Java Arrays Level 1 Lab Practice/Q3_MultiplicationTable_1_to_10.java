
import java.util.Scanner;
public class Q3_MultiplicationTable_1_to_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        while (!input.hasNextInt()) { System.err.print("Invalid integer. Try again: "); input.next(); }
        int number = input.nextInt();
        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) table[i] = number * (i + 1);
        for (int i = 0; i < table.length; i++) System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        input.close();
    }
}

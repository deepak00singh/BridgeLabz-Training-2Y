
import java.util.Scanner;
public class Q5_MultiplicationTable_6_to_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        while (!input.hasNextInt()) { System.err.print("Invalid integer. Try again: "); input.next(); }
        int number = input.nextInt();
        int[] results = new int[4];
        for (int i = 0; i < results.length; i++) results[i] = number * (6 + i);
        for (int i = 0; i < results.length; i++) System.out.println(number + " * " + (6 + i) + " = " + results[i]);
        input.close();
    }
}

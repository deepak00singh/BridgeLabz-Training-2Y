
import java.util.Scanner;
public class Q7_OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number N: ");
        while (!input.hasNextInt()) { System.err.print("Invalid integer. Try again: "); input.next(); }
        int N = input.nextInt();
        if (N < 1) { System.err.println("Error: Not a natural number."); input.close(); return; }
        int size = N / 2 + 1;
        int[] evens = new int[size];
        int[] odds = new int[size];
        int ei = 0, oi = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) evens[ei++] = i; else odds[oi++] = i;
        }
        System.out.println("Odd numbers:");
        for (int i = 0; i < oi; i++) System.out.print(odds[i] + (i < oi - 1 ? " " : ""));
        System.out.println();
        System.out.println("Even numbers:");
        for (int i = 0; i < ei; i++) System.out.print(evens[i] + (i < ei - 1 ? " " : ""));
        System.out.println();
        input.close();
    }
}

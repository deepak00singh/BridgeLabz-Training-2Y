
import java.util.Scanner;
public class Q10_FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        while (!input.hasNextInt()) { System.err.print("Invalid integer. Try again: "); input.next(); }
        int N = input.nextInt();
        if (N < 0) { System.err.println("Error: N must be non-negative."); input.close(); return; }
        String[] results = new String[N + 1];
        for (int i = 0; i < results.length; i++) {
            boolean fizz = (i % 3 == 0);
            boolean buzz = (i % 5 == 0);
            if (fizz && buzz) results[i] = "FizzBuzz";
            else if (fizz) results[i] = "Fizz";
            else if (buzz) results[i] = "Buzz";
            else results[i] = Integer.toString(i);
        }
        for (int i = 0; i < results.length; i++) System.out.println("Position " + i + " = " + results[i]);
        input.close();
    }
}

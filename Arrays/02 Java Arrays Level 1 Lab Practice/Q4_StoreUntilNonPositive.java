
import java.util.Scanner;
public class Q4_StoreUntilNonPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a positive number (<=0 to stop): ");
            if (!input.hasNextDouble()) { System.err.println("Invalid input. Exiting."); input.close(); return; }
            double val = input.nextDouble();
            if (val <= 0.0 || index == arr.length) break;
            arr[index++] = val;
        }
        for (int i = 0; i < index; i++) total += arr[i];
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) System.out.print(arr[i] + (i < index - 1 ? " " : ""));
        System.out.println(); System.out.println("Sum = " + total);
        input.close();
    }
}

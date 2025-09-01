
import java.util.Scanner;
public class Q9_Copy2DTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        while (!input.hasNextInt()) { System.err.print("Invalid. Try again: "); input.next(); }
        int rows = input.nextInt();
        if (rows <= 0) { System.err.println("Rows must be positive."); input.close(); return; }
        System.out.print("Enter number of columns: ");
        while (!input.hasNextInt()) { System.err.print("Invalid. Try again: "); input.next(); }
        int cols = input.nextInt();
        if (cols <= 0) { System.err.println("Columns must be positive."); input.close(); return; }
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                while (!input.hasNextInt()) { System.err.print("Invalid integer. Try again: "); input.next(); }
                matrix[i][j] = input.nextInt();
            }
        }
        int[] array = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) array[index++] = matrix[i][j];
        }
        System.out.println("1D array elements:");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + (i < array.length - 1 ? " " : ""));
        System.out.println();
        input.close();
    }
}

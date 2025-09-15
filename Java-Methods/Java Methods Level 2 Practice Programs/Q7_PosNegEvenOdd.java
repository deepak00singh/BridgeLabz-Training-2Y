import java.util.*;
class Q7_PosNegEvenOdd {
    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int n1, int n2) { if (n1 > n2) return 1; else if (n1 == n2) return 0; else return -1; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (isPositive(arr[i])) {
                if (isEven(arr[i])) System.out.println("Positive Even"); else System.out.println("Positive Odd");
            } else System.out.println("Negative");
        }
        int res = compare(arr[0], arr[4]);
        if (res == 0) System.out.println("Equal");
        else if (res == 1) System.out.println("First greater");
        else System.out.println("First less");
    }
}
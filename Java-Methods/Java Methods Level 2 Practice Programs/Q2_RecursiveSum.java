import java.util.*;
class Q2_RecursiveSum {
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n-1);
    }
    public static int formulaSum(int n) {
        return n * (n+1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) System.out.println("Not a natural number");
        else {
            int rec = recursiveSum(n);
            int form = formulaSum(n);
            System.out.println(rec + " " + form);
        }
    }
}
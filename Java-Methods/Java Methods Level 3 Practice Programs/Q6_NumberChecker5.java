import java.util.*;
class Q6_NumberChecker5 {
    public static int[] properDivisors(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n/2; i++) if (n % i == 0) list.add(i);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }
    public static int sumArray(int[] a) {
        int s = 0; for (int v: a) s += v; return s;
    }
    public static boolean isPerfect(int n) {
        return sumArray(properDivisors(n)) == n;
    }
    public static boolean isAbundant(int n) {
        return sumArray(properDivisors(n)) > n;
    }
    public static boolean isDeficient(int n) {
        return sumArray(properDivisors(n)) < n;
    }
    public static boolean isStrong(int n) {
        int m = Math.abs(n);
        int sum = 0;
        while (m > 0) { int d = m % 10; sum += factorial(d); m /= 10; }
        return sum == n;
    }
    public static int factorial(int k) {
        int f = 1; for (int i = 2; i <= k; i++) f *= i; return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfect(n));
        System.out.println(isAbundant(n));
        System.out.println(isDeficient(n));
        System.out.println(isStrong(n));
    }
}

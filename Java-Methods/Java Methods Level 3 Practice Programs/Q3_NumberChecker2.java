import java.util.*;
class Q3_NumberChecker2 {
    public static int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }
    public static int[] digitsArray(int n) {
        n = Math.abs(n);
        int c = countDigits(n);
        int[] d = new int[c];
        for (int i = c-1; i >= 0; i--) { d[i] = n % 10; n /= 10; }
        return d;
    }
    public static int sumDigits(int n) {
        int[] d = digitsArray(n);
        int s = 0; for (int v: d) s += v; return s;
    }
    public static int sumSquares(int n) {
        int[] d = digitsArray(n);
        int s = 0; for (int v: d) s += Math.pow(v,2); return s;
    }
    public static boolean isHarshad(int n) {
        int s = sumDigits(n);
        if (s == 0) return false;
        return (n % s == 0);
    }
    public static int[][] digitFrequency(int n) {
        int[] d = digitsArray(n);
        int[] freq = new int[10];
        for (int v: d) freq[v]++;
        int[][] res = new int[10][2];
        for (int i = 0; i < 10; i++) { res[i][0] = i; res[i][1] = freq[i]; }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumDigits(n));
        System.out.println(sumSquares(n));
        System.out.println(isHarshad(n));
        int[][] f = digitFrequency(n);
        for (int i = 0; i < f.length; i++) System.out.println(f[i][0] + " " + f[i][1]);
    }
}

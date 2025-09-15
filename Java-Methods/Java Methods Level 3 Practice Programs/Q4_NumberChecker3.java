import java.util.*;
class Q4_NumberChecker3 {
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
    public static int[] reverseArray(int[] a) {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++) r[i] = a[a.length-1-i];
        return r;
    }
    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }
    public static boolean isPalindrome(int n) {
        int[] d = digitsArray(n);
        int[] r = reverseArray(d);
        return arraysEqual(d, r);
    }
    public static boolean isDuckNumber(int n) {
        int[] d = digitsArray(n);
        for (int v: d) if (v == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(digitsArray(n)));
        System.out.println(Arrays.toString(reverseArray(digitsArray(n))));
        System.out.println(arraysEqual(digitsArray(n), reverseArray(digitsArray(n))));
        System.out.println(isPalindrome(n));
        System.out.println(isDuckNumber(n));
    }
}

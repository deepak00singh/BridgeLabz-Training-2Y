import java.util.*;
class Q2_NumberChecker1 {
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
    public static boolean isDuckNumber(int n) {
        int[] d = digitsArray(n);
        for (int v: d) if (v == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int n) {
        int[] d = digitsArray(n);
        int p = d.length;
        int sum = 0;
        for (int v: d) sum += Math.pow(v, p);
        return sum == Math.abs(n);
    }
    public static int[] largestTwo(int[] d) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int v: d) {
            if (v > largest) { second = largest; largest = v; }
            else if (v > second && v < largest) second = v;
        }
        return new int[]{largest, second};
    }
    public static int[] smallestTwo(int[] d) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int v: d) {
            if (v < smallest) { second = smallest; smallest = v; }
            else if (v < second && v > smallest) second = v;
        }
        return new int[]{smallest, second};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
        System.out.println(Arrays.toString(digitsArray(n)));
        System.out.println(isDuckNumber(n));
        System.out.println(isArmstrong(n));
        int[] d = digitsArray(n);
        System.out.println(Arrays.toString(largestTwo(d)));
        System.out.println(Arrays.toString(smallestTwo(d)));
    }
}

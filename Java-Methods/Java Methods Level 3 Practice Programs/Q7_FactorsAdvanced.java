import java.util.*;
class Q7_FactorsAdvanced {
    public static int[] factors(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) cnt++;
        int[] f = new int[cnt]; int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;
        return f;
    }
    public static int greatestFactor(int n, int[] f) {
        int g = 1;
        for (int v: f) if (v > g && v < n) g = v;
        return g;
    }
    public static int sumFactors(int[] f) { int s = 0; for (int v: f) s += v; return s; }
    public static long productFactors(int[] f) { long p = 1; for (int v: f) p *= v; return p; }
    public static long productCubeFactors(int[] f) { long p = 1; for (int v: f) p *= Math.pow(v,3); return p; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = factors(n);
        System.out.println(Arrays.toString(f));
        System.out.println(greatestFactor(n, f));
        System.out.println(sumFactors(f));
        System.out.println(productFactors(f));
        System.out.println(productCubeFactors(f));
    }
}

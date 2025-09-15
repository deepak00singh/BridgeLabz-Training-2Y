import java.util.*;
class Q1_PlayerHeights {
    public static int[] generateHeights() {
        int[] h = new int[11];
        for (int i = 0; i < 11; i++) h[i] = 150 + (int)(Math.random() * 101);
        return h;
    }
    public static int sum(int[] arr) {
        int s = 0;
        for (int v: arr) s += v;
        return s;
    }
    public static double mean(int[] arr) {
        return (double)sum(arr) / arr.length;
    }
    public static int min(int[] arr) {
        int m = arr[0];
        for (int v: arr) if (v < m) m = v;
        return m;
    }
    public static int max(int[] arr) {
        int m = arr[0];
        for (int v: arr) if (v > m) m = v;
        return m;
    }
    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println(Arrays.toString(heights));
        System.out.println("Sum: " + sum(heights));
        System.out.println("Mean: " + mean(heights));
        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
    }
}

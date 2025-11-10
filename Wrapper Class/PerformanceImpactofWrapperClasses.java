import java.util.*;

public class PerformanceImpactofWrapperClasses {
    public static void main(String[] args) {
        int n = 1_000_000;

        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) arr[i] = i;
        long sum1 = 0;
        for (int x : arr) sum1 += x;
        long t2 = System.currentTimeMillis();

        long t3 = System.currentTimeMillis();
        for (int i = 0; i < n; i++) list.add(i);
        long sum2 = 0;
        for (int x : list) sum2 += x;
        long t4 = System.currentTimeMillis();

        System.out.println("int[] time: " + (t2 - t1) + "ms");
        System.out.println("ArrayList<Integer> time: " + (t4 - t3) + "ms");
    }
}

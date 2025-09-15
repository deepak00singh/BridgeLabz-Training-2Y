import java.util.*;
class Q10_RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = (int)(1000 + Math.random() * 9000);
        return arr;
    }
    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }
        double avg = (double)sum / arr.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println(Arrays.toString(arr));
        double[] res = findAverageMinMax(arr);
        System.out.println("Average: " + res[0] + " Min: " + res[1] + " Max: " + res[2]);
    }
}
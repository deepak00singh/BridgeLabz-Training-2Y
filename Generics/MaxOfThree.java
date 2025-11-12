public class MaxOfThree {
    public static <T extends Comparable<? super T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximum(3, 7, 5));              // 7
        System.out.println(maximum(2.5, 1.2, 3.7));        // 3.7
        System.out.println(maximum("apple", "banana", "cat")); // "cat"
    }
}

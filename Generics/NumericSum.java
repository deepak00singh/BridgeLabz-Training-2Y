import java.util.List;

public class NumericSum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> ints = java.util.Arrays.asList(1, 2, 3);
        List<Double> dbls = java.util.Arrays.asList(1.5, 2.5, 3.0);

        System.out.println("Sum ints: " + sumNumbers(ints)); // 6.0
        System.out.println("Sum doubles: " + sumNumbers(dbls)); // 7.0
    }
}

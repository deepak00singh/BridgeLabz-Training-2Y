import java.util.*;
import java.util.stream.*;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 0};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, null, 4, 2));

        ArrayList<Integer> combined = new ArrayList<>();
        for (int r : arr) combined.add(r); // auto-boxing
        combined.addAll(list);

        double avg = combined.stream()
                .filter(Objects::nonNull)
                .mapToInt(i -> i)
                .average()
                .orElse(0);

        System.out.println("Average rating: " + avg);
    }
}

import java.util.ArrayList;

public class AutoBoxingandUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i += 2) {
            list.add(i); // auto-boxing
        }

        int sum = 0;
        for (int num : list) {
            sum += num; // auto-unboxing
        }

        System.out.println("Sum of numbers = " + sum);
    }
}

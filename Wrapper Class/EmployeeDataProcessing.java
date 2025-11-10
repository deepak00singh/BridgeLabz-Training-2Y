import java.util.*;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] arr = {22, 30, 45, 28, 19};

        ArrayList<Integer> list = new ArrayList<>();
        for (int age : arr) list.add(age);

        System.out.println("Youngest: " + Collections.min(list));
        System.out.println("Oldest: " + Collections.max(list));
    }
}

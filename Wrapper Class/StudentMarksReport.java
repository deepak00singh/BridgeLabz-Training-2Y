import java.util.*;

public class StudentMarksReport {
    public static void main(String[] args) {
        String[] inputs = {"85", "95", "null", "88", "abc"};
        ArrayList<Integer> marks = new ArrayList<>();

        for (String s : inputs) {
            try {
                marks.add(Integer.parseInt(s));
            } catch (Exception e) { }
        }

        double avg = marks.stream().mapToInt(i -> i).average().orElse(0);
        System.out.println("Average marks = " + avg);
    }
}

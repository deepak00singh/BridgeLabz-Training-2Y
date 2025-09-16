import java.time.LocalDate;

public class Problem2_DateArithmetic {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Initial Date: " + date);
        System.out.println("Result Date: " + result);
    }
}
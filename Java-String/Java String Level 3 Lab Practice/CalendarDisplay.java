import java.util.Scanner;
import java.time.YearMonth;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year (e.g., 2025): ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();

        System.out.println("\nCalendar for " + yearMonth.getMonth() + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Find the day of week for the 1st of the month (0=Monday, 6=Sunday)
        java.time.LocalDate firstDay = yearMonth.atDay(1);
        int startDay = firstDay.getDayOfWeek().getValue() % 7; // Sunday=0

        // Print initial spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        scanner.close();
    }
}
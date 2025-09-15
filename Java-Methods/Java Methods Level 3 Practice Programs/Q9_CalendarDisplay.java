import java.util.*;
class Q9_CalendarDisplay {
    public static String monthName(int m) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[m-1];
    }
    public static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
    public static int daysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeap(y)) return 29;
        return days[m-1];
    }
    public static int firstDayOfMonth(int m, int y) {
        Calendar cal = new GregorianCalendar(y, m-1, 1);
        return cal.get(Calendar.DAY_OF_WEEK); // 1=Sun ..7=Sat
    }
    public static void printCalendar(int m, int y) {
        System.out.println("    " + monthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int first = firstDayOfMonth(m,y);
        int days = daysInMonth(m,y);
        int cur = 1;
        for (int i = 1; i < first; i++) System.out.print("    ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((first + d -1) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        printCalendar(m,y);
    }
}

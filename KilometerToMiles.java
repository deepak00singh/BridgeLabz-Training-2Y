import java.util.*;

public class quetion10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometer: ");
        double kilometer = sc.nextDouble();
        double miles = kilometer * 0.621371;
        System.out.println("Distance in miles: " + miles);
    }
}
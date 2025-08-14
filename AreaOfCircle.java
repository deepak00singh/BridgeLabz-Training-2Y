import java.util.*;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle: ");
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

import java.util.*;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter width of the rectangle: ");
        int width = sc.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
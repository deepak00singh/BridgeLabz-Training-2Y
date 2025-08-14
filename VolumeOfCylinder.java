import java.util.*;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the cylinder: ");
        int radius = sc.nextInt();
        System.out.print("Enter height of the cylinder: ");
        int height = sc.nextInt();
        double volume = 3.14 * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}

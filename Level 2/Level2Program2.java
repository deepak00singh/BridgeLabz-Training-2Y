import java.util.Scanner;
public class Level2Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        
        double area_cm = 0.5 * base * height;
        double area_in = area_cm / (2.54 * 2.54);
        
        System.out.println("The Area of the triangle in sq in is " + area_in + " and sq cm is " + area_cm);
    }
}
import java.util.*;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        int celsius = sc.nextInt();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
    }
}
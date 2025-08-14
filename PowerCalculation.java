import java.util.*;

public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("enter exponent: ");
        int exponent = sc.nextInt();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }
}
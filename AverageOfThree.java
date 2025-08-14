import java.util.*;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter third number: ");
        int third = sc.nextInt();
        int average = (first + second + third) / 3;
        System.out.println("Average of the three numbers: " + average);
    }
}

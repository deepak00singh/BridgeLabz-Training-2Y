import java.util.*;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount:");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest:");
        double rate = sc.nextDouble();
        System.out.print("Enter time in years:");
        int time = sc.nextInt();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
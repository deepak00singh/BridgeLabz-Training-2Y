import com.bank.util.InterestCalculator;
import static java.lang.Math.*;  // Static import for Math methods like pow()

public class MainApp {
    public static void main(String[] args) {

        double principal = 10000;
        double rate = 5;  // in percent
        double time = 2;  // in years

        double simpleInterest = InterestCalculator.calculateSimpleInterest(principal, rate, time);
        double compoundInterest = principal * (pow((1 + rate / 100), time)) - principal;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest (using static import): " + compoundInterest);
    }
}

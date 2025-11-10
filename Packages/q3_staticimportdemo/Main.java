package packages.q3_staticimportdemo;

// static import lets you use Math methods directly without prefixing Math.
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double a = 16;
        double b = 4;
        double c = -25;

        System.out.println("Square root of " + a + " = " + sqrt(a));
        System.out.println("Power (b^2) = " + pow(b, 2));
        System.out.println("Maximum of a and b = " + max(a, b));
        System.out.println("Minimum of a and b = " + min(a, b));
        System.out.println("Absolute value of c = " + abs(c));

        // Example of using multiple math functions together
        double result = pow(sqrt(a) + b, 2);
        System.out.println("Combined result = " + result);
    }
}

import java.util.*;
class Q9_Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b*b - 4*a*c;
        if (delta < 0) return new double[]{};
        else if (delta == 0) return new double[]{-b / (2*a)};
        else {
            double sqrt = Math.sqrt(delta);
            double r1 = (-b + sqrt) / (2*a);
            double r2 = (-b - sqrt) / (2*a);
            return new double[]{r1, r2};
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        System.out.println(Arrays.toString(roots));
    }
}
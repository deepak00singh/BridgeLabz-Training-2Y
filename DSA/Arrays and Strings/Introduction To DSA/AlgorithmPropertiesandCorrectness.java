package IntroductionToDSA;
public class AlgorithmPropertiesandCorrectness {

    static double calculateAverage(int[] temp, int n) {
        if (n == 0) {
            System.out.println("Cannot calculate average for n = 0");
            return 0;
        }

        int total = 0;

        for (int i = 0; i < n; i++) {
            total = total + temp[i];
        }

        return (double) total / n;
    }

    public static void main(String[] args) {
        int[] temperatures = {20, 25, 22, 24, 21};
        int n = temperatures.length;

        double average = calculateAverage(temperatures, n);
        System.out.println("Average Temperature = " + average);
    }
}

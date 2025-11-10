import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> highTemp = temp -> temp > 37.5;
        double currentTemp = 38.2;

        if (highTemp.test(currentTemp))
            System.out.println("ALERT: High temperature!");
        else
            System.out.println("Temperature normal.");
    }
}

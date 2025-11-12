public class SensorDataLogger {
    public static void logTemp(Double temp) { // wrapper
        System.out.println("Temp stored: " + temp);
    }

    public static void logTempPrimitive(double temp) { // primitive
        System.out.println("Temp stored: " + temp);
    }

    public static void main(String[] args) {
        double p = 36.6;
        Double w = 38.2;

        logTemp(p);     // auto-boxing
        logTempPrimitive(w); // auto-unboxing
    }
}

import java.util.function.Consumer;

public class SmartHomeLighting {
    public static void main(String[] args) {
        // Using lambda to define different light behaviors
        Consumer<String> lightBehavior;

        // Motion detected
        lightBehavior = trigger -> System.out.println("Motion detected! Turning on lights to warm white.");
        lightBehavior.accept("motion");

        // Time of day
        lightBehavior = trigger -> System.out.println("Evening time! Dimming lights to 50%.");
        lightBehavior.accept("time");

        // Voice command
        lightBehavior = trigger -> System.out.println("Voice command received! Changing color to blue.");
        lightBehavior.accept("voice");
    }
}

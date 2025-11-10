import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("Critical", "Heart rate too high!"),
                new Alert("Normal", "Daily checkup reminder"),
                new Alert("Emergency", "Oxygen level dropping!")
        );

        // User preference: only show critical and emergency alerts
        Predicate<Alert> importantAlerts = a -> a.type.equals("Critical") || a.type.equals("Emergency");

        List<Alert> filtered = alerts.stream()
                .filter(importantAlerts)
                .collect(Collectors.toList());

        System.out.println("Filtered Alerts:");
        filtered.forEach(System.out::println);
    }
}

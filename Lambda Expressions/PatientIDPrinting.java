import java.util.*;

public class PatientIDPrinting {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("P101", "P102", "P103");

        // Using method reference
        patientIDs.forEach(System.out::println);
    }
}

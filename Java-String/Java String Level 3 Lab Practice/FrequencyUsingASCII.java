import java.util.*;

public class FrequencyUsingASCII {

    public static String[] frequencyUsingASCII(String text) {
        int[] freq = new int[256]; // ASCII character set size
        for (char c : text.toCharArray()) {
            freq[c]++;
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result.add((char) i + " occurs " + freq[i] + " time(s)");
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequencies = frequencyUsingASCII(input);
        System.out.println("Character frequencies:");
        for (String freq : frequencies) {
            System.out.println(freq);
        }

        scanner.close();
    }
}
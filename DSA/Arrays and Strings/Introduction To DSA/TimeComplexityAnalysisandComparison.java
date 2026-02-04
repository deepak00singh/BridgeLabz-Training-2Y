package IntroductionToDSA;
import java.util.Arrays;
import java.util.HashSet;
public class TimeComplexityAnalysisandComparison {

    // Algorithm A: Linear Search
    static boolean linearSearch(String[] users, String target) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(target)) {
                return true;
            }
        }
        return false;
    }

    // Algorithm B: Binary Search (Array must be sorted)
    static boolean binarySearch(String[] users, String target) {
        int left = 0;
        int right = users.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int cmp = users[mid].compareTo(target);

            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    // Algorithm C: Hash Table Lookup
    static boolean hashSearch(HashSet<String> userSet, String target) {
        return userSet.contains(target);
    }

    public static void main(String[] args) {

        // Sample usernames
        String[] users = {
            "alice", "bob", "charlie", "david", "emma"
        };

        String target = "charlie";

        // Sorting for Binary Search
        Arrays.sort(users);

        // Creating Hash Table
        HashSet<String> userSet = new HashSet<>();
        for (String user : users) {
            userSet.add(user);
        }

        // Running searches
        System.out.println("Linear Search: " + linearSearch(users, target));
        System.out.println("Binary Search: " + binarySearch(users, target));
        System.out.println("Hash Table Search: " + hashSearch(userSet, target));
    }
}

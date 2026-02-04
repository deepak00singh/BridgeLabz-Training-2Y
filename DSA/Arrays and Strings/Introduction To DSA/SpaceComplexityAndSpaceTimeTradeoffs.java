package IntroductionToDSA;
import java.util.HashSet;

public class SpaceComplexityAndSpaceTimeTradeoffs {

    // Implementation A: Nested Loop (Space-Efficient)
    static boolean hasCompletedAllPrerequisitesA(
            int[] completedCourses, int[] prerequisites) {

        for (int i = 0; i < prerequisites.length; i++) {
            boolean found = false;

            for (int j = 0; j < completedCourses.length; j++) {
                if (prerequisites[i] == completedCourses[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }
        return true;
    }

    // Implementation B: HashSet (Time-Efficient)
    static boolean hasCompletedAllPrerequisitesB(
            int[] completedCourses, int[] prerequisites) {

        HashSet<Integer> completedSet = new HashSet<>();

        for (int i = 0; i < completedCourses.length; i++) {
            completedSet.add(completedCourses[i]);
        }

        for (int i = 0; i < prerequisites.length; i++) {
            if (!completedSet.contains(prerequisites[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] completedCourses = {101, 102, 103, 104, 105};
        int[] prerequisites = {102, 104};

        boolean resultA = hasCompletedAllPrerequisitesA(
                completedCourses, prerequisites);

        boolean resultB = hasCompletedAllPrerequisitesB(
                completedCourses, prerequisites);

        System.out.println("Implementation A (Nested Loop): " + resultA);
        System.out.println("Implementation B (HashSet): " + resultB);
    }
}

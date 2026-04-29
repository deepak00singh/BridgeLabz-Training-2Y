import java.util.*;

public class CoursePrerequisiteSystem {
    static Map<String, List<String>> graph = new HashMap<>();
    static Map<String, List<String>> reverse = new HashMap<>();

    static void addCourse(String course) {
        graph.put(course, new ArrayList<>());
        reverse.put(course, new ArrayList<>());
    }

    static void addPrerequisite(String pre, String course) {
        graph.get(pre).add(course);
        reverse.get(course).add(pre);
    }

    static boolean hasCycle(String course, Set<String> visited, Set<String> path) {
        if (path.contains(course)) return true;
        if (visited.contains(course)) return false;

        visited.add(course);
        path.add(course);

        for (String next : graph.get(course)) {
            if (hasCycle(next, visited, path)) return true;
        }

        path.remove(course);
        return false;
    }

    static void collectPrerequisites(String course, Set<String> result) {
        for (String pre : reverse.get(course)) {
            if (result.add(pre)) collectPrerequisites(pre, result);
        }
    }

    static List<String> topologicalSort() {
        Map<String, Integer> indegree = new HashMap<>();
        Queue<String> q = new LinkedList<>();
        List<String> order = new ArrayList<>();

        for (String course : graph.keySet()) indegree.put(course, 0);
        for (String course : graph.keySet()) {
            for (String next : graph.get(course)) {
                indegree.put(next, indegree.get(next) + 1);
            }
        }
        for (String course : indegree.keySet()) {
            if (indegree.get(course) == 0) q.add(course);
        }

        while (!q.isEmpty()) {
            String course = q.poll();
            order.add(course);

            for (String next : graph.get(course)) {
                indegree.put(next, indegree.get(next) - 1);
                if (indegree.get(next) == 0) q.add(next);
            }
        }

        return order;
    }

    public static void main(String[] args) {
        for (String course : Arrays.asList("CS101", "CS102", "CS201", "CS202", "MATH101")) {
            addCourse(course);
        }

        addPrerequisite("CS101", "CS102");
        addPrerequisite("CS101", "CS201");
        addPrerequisite("CS102", "CS202");
        addPrerequisite("MATH101", "CS201");

        boolean cycle = false;
        for (String course : graph.keySet()) {
            if (hasCycle(course, new HashSet<>(), new HashSet<>())) {
                cycle = true;
                break;
            }
        }

        Set<String> required = new HashSet<>();
        collectPrerequisites("CS202", required);

        System.out.println("Representation: Directed adjacency list");
        System.out.println("Cycle exists: " + cycle);
        System.out.println("Prerequisites for CS202: " + required);
        System.out.println("Valid order: " + topologicalSort());
    }
}

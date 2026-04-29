import java.util.*;

public class SocialNetworkConnection {
    static Map<String, List<String>> graph = new HashMap<>();

    static void addUser(String user) {
        graph.put(user, new ArrayList<>());
    }

    static void addFriendship(String a, String b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    static boolean directlyConnected(String a, String b) {
        return graph.get(a).contains(b);
    }

    static List<String> shortestPath(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Map<String, String> parent = new HashMap<>();
        Set<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String cur = q.poll();
            if (cur.equals(end)) break;

            for (String next : graph.get(cur)) {
                if (!visited.contains(next)) {
                    visited.add(next);
                    parent.put(next, cur);
                    q.add(next);
                }
            }
        }

        if (!visited.contains(end)) return Collections.emptyList();

        List<String> path = new ArrayList<>();
        for (String cur = end; cur != null; cur = parent.get(cur)) {
            path.add(cur);
        }
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        for (String user : Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve")) {
            addUser(user);
        }

        addFriendship("Alice", "Bob");
        addFriendship("Alice", "Charlie");
        addFriendship("Bob", "David");
        addFriendship("Charlie", "Eve");
        addFriendship("David", "Eve");

        System.out.println("Representation: Undirected adjacency list");
        System.out.println("Friends of Alice: " + graph.get("Alice"));
        System.out.println("Bob and Eve directly connected: " + directlyConnected("Bob", "Eve"));

        List<String> path = shortestPath("Alice", "Eve");
        System.out.println("Shortest path Alice to Eve: " + path);
        System.out.println("Degree of separation: " + (path.size() - 1));
    }
}

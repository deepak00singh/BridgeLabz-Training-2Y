import java.util.*;

public class NetworkPacketRouting {
    static List<String> routers = Arrays.asList("R1", "R2", "R3", "R4", "R5", "R6");
    static Map<String, List<String>> list = new HashMap<>();
    static int[][] matrix = new int[routers.size()][routers.size()];

    static void addRouter(String router) {
        list.put(router, new ArrayList<>());
    }

    static void addConnection(String a, String b) {
        list.get(a).add(b);
        list.get(b).add(a);

        int i = routers.indexOf(a), j = routers.indexOf(b);
        matrix[i][j] = matrix[j][i] = 1;
    }

    static boolean connected() {
        return bfs("R1").size() == routers.size();
    }

    static Set<String> bfs(String start) {
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String cur = q.poll();
            for (String next : list.get(cur)) {
                if (visited.add(next)) q.add(next);
            }
        }
        return visited;
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

            for (String next : list.get(cur)) {
                if (visited.add(next)) {
                    parent.put(next, cur);
                    q.add(next);
                }
            }
        }

        List<String> path = new ArrayList<>();
        if (!visited.contains(end)) return path;

        for (String cur = end; cur != null; cur = parent.get(cur)) path.add(cur);
        Collections.reverse(path);
        return path;
    }

    static void pathsWithoutFailedEdge(String cur, String end, String a, String b, Set<String> visited, List<String> path) {
        visited.add(cur);
        path.add(cur);

        if (cur.equals(end)) {
            System.out.println(path);
        } else {
            for (String next : list.get(cur)) {
                boolean failed = (cur.equals(a) && next.equals(b)) || (cur.equals(b) && next.equals(a));
                if (!failed && !visited.contains(next)) {
                    pathsWithoutFailedEdge(next, end, a, b, visited, path);
                }
            }
        }

        visited.remove(cur);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        for (String router : routers) addRouter(router);

        addConnection("R1", "R2");
        addConnection("R1", "R3");
        addConnection("R2", "R4");
        addConnection("R3", "R4");
        addConnection("R4", "R5");
        addConnection("R5", "R6");

        System.out.println("Adjacency list: " + list);
        System.out.println("Adjacency matrix:");
        for (int[] row : matrix) System.out.println(Arrays.toString(row));
        System.out.println("Matrix space: O(V^2), List space: O(V + E)");
        System.out.println("Connected: " + connected());
        System.out.println("Alternative paths if R4-R5 fails:");
        pathsWithoutFailedEdge("R1", "R6", "R4", "R5", new HashSet<>(), new ArrayList<>());

        List<String> path = shortestPath("R1", "R6");
        System.out.println("Minimum-hop path: " + path);
        System.out.println("Hops: " + (path.size() - 1));
    }
}

import java.util.*;

public class CityRoadNetwork {
    static class Edge {
        String to;
        int km;

        Edge(String to, int km) {
            this.to = to;
            this.km = km;
        }

        public String toString() {
            return to + "(" + km + "km)";
        }
    }

    static Map<String, List<Edge>> graph = new HashMap<>();

    static void addNode(String node) {
        graph.put(node, new ArrayList<>());
    }

    static void addRoad(String from, String to, int km) {
        graph.get(from).add(new Edge(to, km));
    }

    static void addTwoWayRoad(String a, String b, int km) {
        addRoad(a, b, km);
        addRoad(b, a, km);
    }

    static List<String> bfsPath(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Map<String, String> parent = new HashMap<>();
        Set<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String cur = q.poll();
            if (cur.equals(end)) break;

            for (Edge edge : graph.get(cur)) {
                if (visited.add(edge.to)) {
                    parent.put(edge.to, cur);
                    q.add(edge.to);
                }
            }
        }

        List<String> path = new ArrayList<>();
        if (!visited.contains(end)) return path;

        for (String cur = end; cur != null; cur = parent.get(cur)) path.add(cur);
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        for (String node : Arrays.asList("A", "B", "C", "D", "E")) addNode(node);

        addRoad("A", "B", 5);
        addTwoWayRoad("B", "C", 3);
        addTwoWayRoad("A", "D", 7);
        addRoad("D", "E", 2);
        addRoad("C", "E", 4);

        System.out.println("Representation: Directed weighted adjacency list");
        System.out.println("Graph: " + graph);
        System.out.println("Reachable from A: " + bfsReach("A"));
        System.out.println("Fewest-turn path A to E: " + bfsPath("A", "E"));
        System.out.println("DFS may not give shortest path because it follows one branch deeply first.");
    }

    static Set<String> bfsReach(String start) {
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String cur = q.poll();
            for (Edge edge : graph.get(cur)) {
                if (visited.add(edge.to)) q.add(edge.to);
            }
        }
        return visited;
    }
}

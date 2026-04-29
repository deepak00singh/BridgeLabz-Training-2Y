import java.util.*;

public class IslandCounter {
    static int[][] dir4 = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int[][] dir8 = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    static int countDFS(int[][] grid, boolean diagonal) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    count++;
                    dfs(grid, visited, i, j, diagonal ? dir8 : dir4);
                }
            }
        }
        return count;
    }

    static void dfs(int[][] grid, boolean[][] visited, int r, int c, int[][] dir) {
        if (r < 0 || c < 0 || r == grid.length || c == grid[0].length || grid[r][c] == 0 || visited[r][c]) {
            return;
        }

        visited[r][c] = true;
        for (int[] d : dir) dfs(grid, visited, r + d[0], c + d[1], dir);
    }

    static int countBFS(int[][] grid, boolean diagonal) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        int[][] dir = diagonal ? dir8 : dir4;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i, j});
                    visited[i][j] = true;

                    while (!q.isEmpty()) {
                        int[] cell = q.poll();
                        for (int[] d : dir) {
                            int r = cell[0] + d[0], c = cell[1] + d[1];
                            if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length
                                    && grid[r][c] == 1 && !visited[r][c]) {
                                visited[r][c] = true;
                                q.add(new int[]{r, c});
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 1, 0, 1},
                {0, 0, 0, 1, 1}
        };

        System.out.println("Graph model: land cells are vertices, adjacent lands are edges");
        System.out.println("DFS islands: " + countDFS(grid, false));
        System.out.println("BFS islands: " + countBFS(grid, false));
        System.out.println("Time: O(rows * cols), Space: O(rows * cols)");
        System.out.println("With diagonals: use 8 directions, islands = " + countDFS(grid, true));
    }
}

import java.util.*;
class Q14_MatrixOperations {
    public static int[][] randomMatrix(int r,int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) m[i][j] = (int)(Math.random()*10);
        return m;
    }
    public static int[][] add(int[][] a,int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) res[i][j] = a[i][j] + b[i][j];
        return res;
    }
    public static int[][] subtract(int[][] a,int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) res[i][j] = a[i][j] - b[i][j];
        return res;
    }
    public static int[][] multiply(int[][] a,int[][] b) {
        int r = a.length, c = b[0].length, m = b.length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) for (int k = 0; k < m; k++) res[i][j] += a[i][k] * b[k][j];
        return res;
    }
    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) System.out.println(Arrays.toString(a[i]));
    }
    public static void main(String[] args) {
        int[][] a = randomMatrix(2,3);
        int[][] b = randomMatrix(2,3);
        System.out.println("A"); print(a);
        System.out.println("B"); print(b);
        System.out.println("A+B"); print(add(a,b));
        System.out.println("A-B"); print(subtract(a,b));
        int[][] c = randomMatrix(3,2);
        System.out.println("A* C"); print(multiply(a,c));
    }
}

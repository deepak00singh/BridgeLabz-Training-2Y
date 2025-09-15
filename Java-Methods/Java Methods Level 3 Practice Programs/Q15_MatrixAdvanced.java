import java.util.*;
class Q15_MatrixAdvanced {
    public static double[][] randomMatrix(int r,int c) {
        double[][] m = new double[r][c];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) m[i][j] = (int)(Math.random()*10);
        return m;
    }
    public static double[][] transpose(double[][] a) {
        int r = a.length, c = a[0].length;
        double[][] t = new double[c][r];
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) t[j][i] = a[i][j];
        return t;
    }
    public static double det2(double[][] a) {
        return a[0][0]*a[1][1] - a[0][1]*a[1][0];
    }
    public static double det3(double[][] a) {
        double d = a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1]) - a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0]) + a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
        return d;
    }
    public static double[][] inverse2(double[][] a) {
        double d = det2(a);
        if (d == 0) return new double[][]{};
        double[][] inv = {{a[1][1]/d, -a[0][1]/d},{-a[1][0]/d, a[0][0]/d}};
        return inv;
    }
    public static double[][] inverse3(double[][] a) {
        double d = det3(a);
        if (d == 0) return new double[][]{};
        double[][] adj = new double[3][3];
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) {
            double[][] minor = new double[2][2];
            int mi=0,mj=0;
            for (int r = 0; r < 3; r++) for (int c = 0; c < 3; c++) if (r!=i && c!=j) { minor[mi][mj] = a[r][c]; mj++; if (mj==2){mj=0;mi++;} }
            double co = ((i+j)%2==0?1:-1) * det2(minor);
            adj[j][i] = co;
        }
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) inv[i][j] = adj[i][j] / d;
        return inv;
    }
    public static void print(double[][] a) {
        for (int i = 0; i < a.length; i++) System.out.println(Arrays.toString(a[i]));
    }
    public static void main(String[] args) {
        double[][] a2 = randomMatrix(2,2);
        System.out.println("2x2 Matrix"); print(a2);
        System.out.println("Determinant: " + det2(a2));
        System.out.println("Inverse:"); print(inverse2(a2));
        double[][] a3 = randomMatrix(3,3);
        System.out.println("3x3 Matrix"); print(a3);
        System.out.println("Determinant: " + det3(a3));
        System.out.println("Inverse:"); print(inverse3(a3));
    }
}

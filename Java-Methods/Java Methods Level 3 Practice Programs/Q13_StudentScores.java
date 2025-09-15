import java.util.*;
class Q13_StudentScores {
    public static int[][] generateScores(int n) {
        int[][] s = new int[n][3];
        for (int i = 0; i < n; i++) {
            s[i][0] = 10 + (int)(Math.random()*90);
            s[i][1] = 10 + (int)(Math.random()*90);
            s[i][2] = 10 + (int)(Math.random()*90);
        }
        return s;
    }
    public static double[][] totalsAndPercentages(int[][] s) {
        double[][] res = new double[s.length][3];
        for (int i = 0; i < s.length; i++) {
            int total = s[i][0] + s[i][1] + s[i][2];
            double avg = (double)total / 3.0;
            double percent = (double)total / 3.0;
            res[i][0] = total;
            res[i][1] = Math.round(avg * 100.0) / 100.0;
            res[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return res;
    }
    public static void printScorecard(int[][] s, double[][] t) {
        System.out.println("P C M\tTotal\tAvg\t%");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i][0] + " " + s[i][1] + " " + s[i][2] + "\t" + (int)t[i][0] + "\t" + t[i][1] + "\t" + t[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] s = generateScores(n);
        double[][] t = totalsAndPercentages(s);
        printScorecard(s, t);
    }
}

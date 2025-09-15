import java.util.*;
class Q11_ZaraBonus {
    public static int[][] generateEmployees() {
        int[][] arr = new int[10][2];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = 10000 + (int)(Math.random() * 90000);
            arr[i][1] = (int)(Math.random() * 11);
        }
        return arr;
    }
    public static double[][] computeNewSalaryAndBonus(int[][] old) {
        double[][] res = new double[old.length][2];
        for (int i = 0; i < old.length; i++) {
            int sal = old[i][0]; int years = old[i][1];
            double pct = years > 5 ? 0.05 : 0.02;
            double bonus = sal * pct;
            double newSal = sal + bonus;
            res[i][0] = newSal;
            res[i][1] = bonus;
        }
        return res;
    }
    public static void totals(int[][] old, double[][] nw) {
        long sumOld = 0; double sumNew = 0; double totalBonus = 0;
        for (int i = 0; i < old.length; i++) { sumOld += old[i][0]; sumNew += nw[i][0]; totalBonus += nw[i][1]; }
        System.out.println("Sum Old: " + sumOld);
        System.out.println("Sum New: " + Math.round(sumNew));
        System.out.println("Total Bonus: " + Math.round(totalBonus));
    }
    public static void main(String[] args) {
        int[][] old = generateEmployees();
        double[][] nw = computeNewSalaryAndBonus(old);
        System.out.println("Salary Years NewSalary Bonus");
        for (int i = 0; i < old.length; i++) System.out.println(old[i][0] + " " + old[i][1] + " " + (int)nw[i][0] + " " + (int)nw[i][1]);
        totals(old, nw);
    }
}

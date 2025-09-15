import java.util.*;
class Q10_CollinearPoints {
    public static boolean collinearSlope(int x1,int y1,int x2,int y2,int x3,int y3) {
        long a = (long)(y2 - y1) * (x3 - x2);
        long b = (long)(y3 - y2) * (x2 - x1);
        return a == b;
    }
    public static boolean collinearArea(int x1,int y1,int x2,int y2,int x3,int y3) {
        int areaTimes2 = x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2);
        return areaTimes2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(); int y1 = sc.nextInt();
        int x2 = sc.nextInt(); int y2 = sc.nextInt();
        int x3 = sc.nextInt(); int y3 = sc.nextInt();
        System.out.println(collinearSlope(x1,y1,x2,y2,x3,y3));
        System.out.println(collinearArea(x1,y1,x2,y2,x3,y3));
    }
}

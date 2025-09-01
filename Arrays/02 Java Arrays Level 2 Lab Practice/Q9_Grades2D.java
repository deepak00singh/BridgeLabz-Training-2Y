
import java.util.*;
class Q9_Grades2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][3];
        double[] per=new double[n];
        String[] g=new String[n];
        for(int i=0;i<n;i++){a[i][0]=sc.nextInt();a[i][1]=sc.nextInt();a[i][2]=sc.nextInt();
            per[i]=(a[i][0]+a[i][1]+a[i][2])/3.0;
            if(per[i]>=90)g[i]="A";else if(per[i]>=75)g[i]="B";else if(per[i]>=50)g[i]="C";else g[i]="D";}
        for(int i=0;i<n;i++)System.out.println(a[i][0]+" "+a[i][1]+" "+a[i][2]+" "+per[i]+" "+g[i]);
    }
}

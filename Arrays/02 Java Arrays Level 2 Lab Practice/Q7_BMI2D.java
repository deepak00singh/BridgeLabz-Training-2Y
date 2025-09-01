
import java.util.*;
class Q7_BMI2D{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[][] a=new double[n][3];
        String[] st=new String[n];
        for(int i=0;i<n;i++){a[i][0]=sc.nextDouble();a[i][1]=sc.nextDouble();a[i][2]=a[i][0]/(a[i][1]*a[i][1]);
            if(a[i][2]<18.5)st[i]="Under";else if(a[i][2]<25)st[i]="Normal";else if(a[i][2]<30)st[i]="Over";else st[i]="Obese";}
        for(int i=0;i<n;i++)System.out.println(a[i][0]+" "+a[i][1]+" "+a[i][2]+" "+st[i]);
    }
}

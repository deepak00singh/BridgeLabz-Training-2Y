
import java.util.*;
class Q6_BMI{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] w=new double[n],h=new double[n],b=new double[n];
        String[] st=new String[n];
        for(int i=0;i<n;i++){w[i]=sc.nextDouble();h[i]=sc.nextDouble();b[i]=w[i]/(h[i]*h[i]);
            if(b[i]<18.5)st[i]="Under";else if(b[i]<25)st[i]="Normal";else if(b[i]<30)st[i]="Over";else st[i]="Obese";}
        for(int i=0;i<n;i++)System.out.println(w[i]+" "+h[i]+" "+b[i]+" "+st[i]);
    }
}

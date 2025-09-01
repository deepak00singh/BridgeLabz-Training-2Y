
import java.util.*;
class Q1_Bonus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] s=new double[10],y=new double[10],b=new double[10],ns=new double[10];
        double tb=0,to=0,tn=0;
        for(int i=0;i<10;i++){
            s[i]=sc.nextDouble();
            y[i]=sc.nextDouble();
        }
        for(int i=0;i<10;i++){
            if(y[i]>5)b[i]=s[i]*0.05;else b[i]=s[i]*0.02;
            ns[i]=s[i]+b[i];
            tb+=b[i];to+=s[i];tn+=ns[i];
        }
        System.out.println("Total Bonus:"+tb+" Old:"+to+" New:"+tn);
    }
}

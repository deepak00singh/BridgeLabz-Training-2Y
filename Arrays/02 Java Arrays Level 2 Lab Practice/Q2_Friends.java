
import java.util.*;
class Q2_Friends{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] age=new int[3];
        double[] h=new double[3];
        for(int i=0;i<3;i++){age[i]=sc.nextInt();h[i]=sc.nextDouble();}
        int yi=0;double ti=0;int yiIndex=0,tiIndex=0;
        yi=age[0];ti=h[0];
        for(int i=1;i<3;i++){if(age[i]<yi){yi=age[i];yiIndex=i;}if(h[i]>ti){ti=h[i];tiIndex=i;}}
        System.out.println("Youngest index:"+yiIndex+" Tallest index:"+tiIndex);
    }
}

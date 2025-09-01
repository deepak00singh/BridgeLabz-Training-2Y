
import java.util.*;
class Q5_Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0,t=n;
        while(t>0){c++;t/=10;}
        int[] d=new int[c];
        for(int i=0;i<c;i++){d[i]=n%10;n/=10;}
        for(int i=0;i<c;i++)System.out.print(d[i]);
    }
}

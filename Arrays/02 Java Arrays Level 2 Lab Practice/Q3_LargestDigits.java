
import java.util.*;
class Q3_LargestDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] d=new int[10];int i=0;
        while(n>0&&i<10){d[i++]=n%10;n/=10;}
        int l=0,s=0;
        for(int j=0;j<i;j++){if(d[j]>l){s=l;l=d[j];}else if(d[j]>s&&d[j]<l)s=d[j];}
        System.out.println("Largest:"+l+" Second:"+s);
    }
}

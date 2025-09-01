
import java.util.*;
class Q4_DynamicDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int size=10;int[] d=new int[size];int i=0;
        while(n>0){if(i==size){size+=10;d=Arrays.copyOf(d,size);}d[i++]=n%10;n/=10;}
        int l=0,s=0;
        for(int j=0;j<i;j++){if(d[j]>l){s=l;l=d[j];}else if(d[j]>s&&d[j]<l)s=d[j];}
        System.out.println("Largest:"+l+" Second:"+s);
    }
}

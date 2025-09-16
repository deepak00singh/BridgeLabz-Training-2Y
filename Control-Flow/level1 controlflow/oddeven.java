import java.util.Scanner;
class main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    if(n>0){
      for(int i=1;i<=n;i++){
        if(i%2==0)
          System.out.println(i+" is even number");
        else
          System.out.println(i+" is odd number");
      }
    } else {
      System.out.println("The number "+n+" is not a natural number");
    }
  }
}

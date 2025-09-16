import java.util.Scanner;
class main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    if(n>=0){
      int fact=1, i=1;
      while(i<=n){
        fact*=i;
        i++;
      }
      System.out.println("Factorial of "+n+" = "+fact);
    } else {
      System.out.println("The number "+n+" is not a positive integer");
    }
  }
}

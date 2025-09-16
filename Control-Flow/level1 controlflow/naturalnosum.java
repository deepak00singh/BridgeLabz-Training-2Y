import java.util.Scanner;
class main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    if(n>0){
      // formula method
      int formulaSum = n*(n+1)/2;

      // while loop method
      int i=1, loopSum=0;
      while(i<=n){
        loopSum+=i;
        i++;
      }

      System.out.println("Sum using formula = "+formulaSum);
      System.out.println("Sum using while loop = "+loopSum);

      if(formulaSum==loopSum)
        System.out.println("Both results are correct!");
      else
        System.out.println("Results do not match!");
    } else {
      System.out.println("The number "+n+" is not a natural number");
    }
  }
}

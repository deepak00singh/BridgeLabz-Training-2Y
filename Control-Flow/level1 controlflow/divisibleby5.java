import java.util.Scanner;
class main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Is the number "+n+" divisible by 5? "+(n%5==0));
  }
}

import java.util.Scanner;
class RocketLaunch {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=n; i>=1; i--){
      System.out.println(i);
    }
    System.out.println("Liftoff!");
  }
}

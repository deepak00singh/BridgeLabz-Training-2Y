import java.util.Scanner;
class main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n>0 && n<100){
      int i = 100;
      while(i >= 1){
        if(i % n == 0)
          System.out.println(i);
        i--;
      }
    } else {
      System.out.println("The number "+n+" is not a positive integer below 100");
    }
  }
}

import java.util.Scanner;
class main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int pow = sc.nextInt();

    if(num>=0 && pow>=0){
      int result = 1;
      int counter = 0;
      while(counter < pow){
        result *= num;
        counter++;
      }
      System.out.println(result);
    } else {
      System.out.println("Number and power should be positive integers");
    }
  }
}

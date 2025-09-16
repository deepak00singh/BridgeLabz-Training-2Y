import java.util.Scanner;
class main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n>0){
      int greatestFactor = 1;
      for(int i = n-1; i>=1; i--){
        if(n % i == 0){
          greatestFactor = i;
          break;
        }
      }
      System.out.println("Greatest factor besides itself = "+greatestFactor);
    } else {
      System.out.println("The number "+n+" is not a positive integer");
    }
  }
}

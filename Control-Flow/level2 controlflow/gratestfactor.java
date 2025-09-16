import java.util.Scanner;
class main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n>0){
      int greatestFactor = 1;
      int counter = n-1;
      while(counter >= 1){
        if(n % counter == 0){
          greatestFactor = counter;
          break;
        }
        counter--;
      }
      System.out.println("Greatest factor besides itself = "+greatestFactor);
    } else {
      System.out.println("The number "+n+" is not a positive integer");
    }
  }
}

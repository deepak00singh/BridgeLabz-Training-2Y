import java.util.*;
public class Demo{
   static final int MAX = 6;
   static int intArray[] = new int[MAX];
   static int front = 0;
   static int rear = -1;
   static int itemCount = 0;
public static boolean isFull(){
   return itemCount == MAX;
}
public static boolean isEmpty(){
   return itemCount == 0;
}
public static int removeData(){
   int data = intArray[front++];
   if(front == MAX) {
      front = 0;
   }
   itemCount--;
   return data;
}
public static void insert(int data){
   if(!isFull()) {
      if(rear == MAX-1) {
         rear = -1;
      }
      intArray[++rear] = data;
      itemCount++;
   }
}
public static void main(String[] args){
   insert(1);
   insert(2);
   insert(3);
   insert(4);
   while(!isEmpty()) {
      int n = removeData();
      System.out.print(n + " ");
   }
}
}

import java.util.*; 
public class LinkedListQueueDemo {
   static class Node {
      int data;
      Node next;

      Node(int data) {
         this.data = data;
      }
   }

   static Node front = null;
   static Node rear = null;
   static int itemCount = 0;

   public static boolean isEmpty() {
      return front == null;
   }

   public static int removeData() {
      if (isEmpty()) {
         System.out.println("Queue is empty");
         return -1;
      }

      int data = front.data;
      front = front.next;

      if (front == null) {
         rear = null;
      }

      itemCount--;
      return data;
   }

   public static void insert(int data) {
      Node newNode = new Node(data);

      if (isEmpty()) {
         front = newNode;
         rear = newNode;
      } else {
         rear.next = newNode;
         rear = newNode;
      }

      itemCount++;
   }

   public static void main(String[] args) {
      insert(1);
      insert(2);
      insert(3);
      insert(4);

      while (!isEmpty()) {
         int n = removeData();
         System.out.print(n + " ");
      }
   }
}

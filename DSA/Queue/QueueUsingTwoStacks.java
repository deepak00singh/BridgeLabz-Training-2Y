import java.util.Stack;

public class QueueUsingTwoStacks {
   static Stack<Integer> stack1 = new Stack<>();
   static Stack<Integer> stack2 = new Stack<>();

   public static boolean isEmpty() {
      return stack1.isEmpty() && stack2.isEmpty();
   }

   public static void enqueue(int data) {
      stack1.push(data);
   }

   public static int dequeue() {
      if (isEmpty()) {
         System.out.println("Queue is empty");
         return -1;
      }

      if (stack2.isEmpty()) {
         while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
         }
      }

      return stack2.pop();
   }

   public static void main(String[] args) {
      enqueue(1);
      enqueue(2);
      enqueue(3);
      enqueue(4);

      while (!isEmpty()) {
         System.out.print(dequeue() + " ");
      }
   }
}

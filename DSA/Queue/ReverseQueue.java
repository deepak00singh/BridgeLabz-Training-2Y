from collections import deque

def reverse_queue(queue):
    # Base case: if queue is empty, return
    if len(queue) == 0:
        return
    
    # Remove front element
    front = queue.popleft()
    
    # Recursively reverse the remaining queue
    reverse_queue(queue)
    
    # Add the front element to the back
    queue.append(front)

# Example usage
q = deque([1, 2, 3, 4, 5])
reverse_queue(q)
print(q)  # Output: deque([5, 4, 3, 2, 1])
import java.util.Queue;
import java.util.LinkedList;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        // Base case: if queue is empty, return
        if (queue.isEmpty()) {
            return;
        }
        
        // Remove front element
        int front = queue.poll();
        
        // Recursively reverse the remaining queue
        reverseQueue(queue);
        
        // Add the front element to the back
        queue.offer(front);
    }
    
    // Example usage
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        
        reverseQueue(q);
        System.out.println(q);  // Output: [5, 4, 3, 2, 1]
    }
}
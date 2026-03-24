public class PushFunction {
    int[] queue = new int[10];
    int rear = -1;
    int front = -1;
    public void push(int d) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        queue[rear] = d;
        System.out.println(d + " inserted into queue");
    }
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PushFunction q = new PushFunction();
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println("Queue elements:");
        q.display();
    }
}
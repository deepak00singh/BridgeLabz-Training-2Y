public class CricularQueue {
    static class CircularQueue {
        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
            }
        }
        private Node rear;
        private final int capacity;
        private int count;
        CircularQueue(int capacity) {
            this.capacity = capacity;
            this.rear = null;
            this.count = 0;
        }
        boolean isEmpty() {
            return rear == null;
        }
        boolean isFull() {
            return count == capacity;
        }
        void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            Node newNode = new Node(data);
            if (isEmpty()) {
                rear = newNode;
                rear.next = rear;
            } else {
                newNode.next = rear.next;
                rear.next = newNode;
                rear = newNode;
            }
            count++;
            System.out.println(data + " inserted");
        }
        void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            Node front = rear.next;
            System.out.println(front.data + " removed");
            if (front == rear) {
                rear = null;
            } else {
                rear.next = front.next;
            }
            count--;
        }
        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return rear.next.data;
        }
        void display() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }
            Node front = rear.next;
            Node current = front;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != front);

            System.out.println();
        }
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
        q.enqueue(5);
        q.enqueue(6);
        q.display();
    }
}

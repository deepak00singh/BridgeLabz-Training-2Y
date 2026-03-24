public class CircularIncrementUsingGenerics {

    // Generic Circular Queue
    static class CircularQueue<T> {
        private T[] arr;
        private int front, back, size;

        @SuppressWarnings("unchecked")
        CircularQueue(int size) {
            this.size = size;
            arr = (T[]) new Object[size]; // generic array creation
            front = -1;
            back = -1;
        }

        // Enqueue
        public void enqueue(T value) {
            if ((back + 1) % size == front) {
                System.out.println("Queue is Full");
                return;
            }

            if (front == -1) {
                front = 0;
                back = 0;
            } else {
                back = (back + 1) % size; // circular increment
            }

            arr[back] = value;
            System.out.println(value + " inserted");
        }

        // Dequeue
        public T dequeue() {
            if (front == -1) {
                System.out.println("Queue is Empty");
                return null;
            }

            T removed = arr[front];

            if (front == back) {
                front = back = -1;
            } else {
                front = (front + 1) % size; // circular increment
            }

            return removed;
        }

        // Peek
        public T peek() {
            if (front == -1) {
                System.out.println("Queue is Empty");
                return null;
            }
            return arr[front];
        }

        // Display
        public void display() {
            if (front == -1) {
                System.out.println("Queue is Empty");
                return;
            }

            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == back) break;
                i = (i + 1) % size; // circular increment
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        // Integer Queue
        CircularQueue<Integer> intQueue = new CircularQueue<>(5);

        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        intQueue.enqueue(40);
        intQueue.enqueue(50);

        intQueue.display();

        System.out.println("Removed: " + intQueue.dequeue());
        System.out.println("Removed: " + intQueue.dequeue());

        intQueue.display();

        intQueue.enqueue(60);
        intQueue.enqueue(70);

        intQueue.display();

        // String Queue (showing generics power)
        CircularQueue<String> strQueue = new CircularQueue<>(3);

        strQueue.enqueue("A");
        strQueue.enqueue("B");
        strQueue.enqueue("C");

        strQueue.display();
    }
}
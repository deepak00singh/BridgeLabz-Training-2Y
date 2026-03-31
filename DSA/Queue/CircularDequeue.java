class CircularDequeue {
    int[] arr;
    int front, rear, size, capacity;
    public CircularDequeue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    void insertFront(int x) {
        if (size == capacity) {
            System.out.println("Full");
            return;
        }
        front = (front - 1 + capacity) % capacity;
        arr[front] = x;
        size++;
    }
    void insertRear(int x) {
        if (size == capacity) {
            System.out.println("Full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }
    void deleteFront() {
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        front = (front + 1) % capacity;
        size--;
    }
    void deleteRear() {
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        rear = (rear - 1 + capacity) % capacity;
        size--;
    }
    void display() {
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        for (int j = 0; j < size; j++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularDequeue dq = new CircularDequeue(5);
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertRear(30);
        dq.insertFront(1);
        dq.display();
        dq.deleteFront();
        dq.display();
        dq.deleteRear();
        dq.display();
    }
}
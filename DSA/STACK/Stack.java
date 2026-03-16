public class Stack {
    private int top;
    private int size;
    private int[] stack;

    public Stack(int size){
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }
    public void push(int x){
        if(top == size - 1){
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = x;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int value = stack[top];
            top--;
            return value;   
}    }

    public boolean isEmpty(){
        return top == -1;
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop());

        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is Not Empty");
        }
    }
}
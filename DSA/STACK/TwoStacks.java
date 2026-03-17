public class TwoStacks {
    private int[] arr;
    private int size;
    private int top1;
    private int top2;

    public TwoStacks(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = n;
    }

    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push1(11);
        ts.push2(15);
        ts.push1(23);
        ts.push2(6);

        System.out.println("Popped element from stack1 is: " + ts.pop1());
        System.out.println("Popped element from stack2 is: " + ts.pop2());
    }
}
import java.util.Scanner;
import java.util.Stack;

public class SortStackInAsc {

    static void sortedInsert(Stack<Integer> st, int x) {
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }

        int temp = st.pop();
        sortedInsert(st, x);
        st.push(temp);
    }

    static void sortStack(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int temp = st.pop();
            sortStack(st);
            sortedInsert(st, temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }

        sortStack(st);

        System.out.println("Stack in ascending order: " + st);
        sc.close();
    }
}

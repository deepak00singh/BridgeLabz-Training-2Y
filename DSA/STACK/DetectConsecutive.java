import java.util.Scanner;
import java.util.Stack;

public class ConsecutiveStackCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        Stack<String> st = new Stack<>();

        int result = 1;

        System.out.println("Enter the words:");

        for (int i = 0; i < n; i++) {

            String word = sc.next();

            if (!st.isEmpty() && st.peek().equals(word)) {
                result = 0;
                break;
            }

            st.push(word);
        }

        System.out.println("Output: " + result);

        sc.close();
    }
} 

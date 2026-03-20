import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    static String convert(String exp) {
        Stack<Character> st = new Stack<>();
        String result = "";

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // operand
            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }
            // (
            else if (ch == '(') {
                st.push(ch);
            }
            // )
            else if (ch == ')') {
                while (st.peek() != '(') {
                    result += st.pop();
                }
                st.pop(); // remove (
            }
            // operator
            else {
                while (!st.isEmpty() &&
                precedence(st.peek()) >= precedence(ch)) {
                    result += st.pop();
                }
                st.push(ch);
            }
        }

        // pop remaining
        while (!st.isEmpty()) {
            result += st.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();
        String postfix = convert(infix);
        System.out.println("Postfix expression: " + postfix);
    }
}
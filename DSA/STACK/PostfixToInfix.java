import java.util.*;
import java.util.Stack;
public class PostfixToInfix {

    static String convert(String exp) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // skip spaces (optional but good practice)
            if (ch == ' ') continue;

            // operand (digit OR letter)
            if (Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            }
            // operator
            else {
                String val2 = st.pop();
                String val1 = st.pop();

                String temp = "(" + val1 + ch + val2 + ")";
                st.push(temp);
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Postfix Expression: ");
        String exp = sc.nextLine();

        System.out.println("Infix Expression: " + convert(exp));
    }
}
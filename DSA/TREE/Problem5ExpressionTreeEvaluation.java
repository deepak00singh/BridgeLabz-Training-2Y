import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Problem5ExpressionTreeEvaluation {
    static class Node {
        String value;
        Node left;
        Node right;

        Node(String value) {
            this.value = value;
        }
    }

    static void preorder(Node root, List<String> output) {
        if (root == null) {
            return;
        }
        output.add(root.value);
        preorder(root.left, output);
        preorder(root.right, output);
    }

    static void inorder(Node root, List<String> output) {
        if (root == null) {
            return;
        }
        inorder(root.left, output);
        output.add(root.value);
        inorder(root.right, output);
    }

    static void postorder(Node root, List<String> output) {
        if (root == null) {
            return;
        }
        postorder(root.left, output);
        postorder(root.right, output);
        output.add(root.value);
    }

    static boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }

    static String toInfix(Node root) {
        if (root == null) {
            return "";
        }
        if (!isOperator(root.value)) {
            return root.value;
        }
        return "(" + toInfix(root.left) + " " + root.value + " " + toInfix(root.right) + ")";
    }

    static int evaluatePostfix(List<String> postfix) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : postfix) {
            if (!isOperator(token)) {
                stack.push(Integer.parseInt(token));
                continue;
            }

            int right = stack.pop();
            int left = stack.pop();
            int result;

            switch (token) {
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
                case "*":
                    result = left * right;
                    break;
                default:
                    result = left / right;
                    break;
            }
            stack.push(result);
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Node root = new Node("*");
        root.left = new Node("+");
        root.right = new Node("-");
        root.left.left = new Node("3");
        root.left.right = new Node("5");
        root.right.left = new Node("8");
        root.right.right = new Node("2");

        List<String> inorderResult = new ArrayList<>();
        List<String> preorderResult = new ArrayList<>();
        List<String> postorderResult = new ArrayList<>();

        inorder(root, inorderResult);
        preorder(root, preorderResult);
        postorder(root, postorderResult);

        System.out.println("a) Postorder traversal (postfix): " + postorderResult);
        System.out.println("b) Inorder traversal: " + inorderResult);
        System.out.println("Infix with parentheses: " + toInfix(root));
        System.out.println("c) Preorder traversal (prefix): " + preorderResult);
        System.out.println("d) Final result using postorder evaluation: " + evaluatePostfix(postorderResult));

        Node expressionRoot = new Node("-");
        expressionRoot.left = new Node("+");
        expressionRoot.right = new Node("e");
        expressionRoot.left.left = new Node("*");
        expressionRoot.left.right = new Node("/");
        expressionRoot.left.left.left = new Node("a");
        expressionRoot.left.left.right = new Node("b");
        expressionRoot.left.right.left = new Node("c");
        expressionRoot.left.right.right = new Node("d");

        List<String> expressionPreorder = new ArrayList<>();
        List<String> expressionPostorder = new ArrayList<>();

        preorder(expressionRoot, expressionPreorder);
        postorder(expressionRoot, expressionPostorder);

        System.out.println("\ne) Expression tree for ((a * b) + (c / d)) - e");
        System.out.println("Inorder: " + toInfix(expressionRoot));
        System.out.println("Preorder: " + expressionPreorder);
        System.out.println("Postorder: " + expressionPostorder);
    }
}

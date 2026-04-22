import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3BSTConstructionValidation {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    static void inorder(Node root, List<Integer> output) {
        if (root == null) {
            return;
        }
        inorder(root.left, output);
        output.add(root.data);
        inorder(root.right, output);
    }

    static boolean isValidBST(Node root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }
        return isValidBST(root.left, min, root.data) && isValidBST(root.right, root.data, max);
    }

    static int heightInEdges(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(heightInEdges(root.left), heightInEdges(root.right));
    }

    static void searchWithTrace(Node root, int key) {
        Node current = root;
        while (current != null) {
            if (key < current.data) {
                System.out.println(key + " vs " + current.data + " -> go left");
                current = current.left;
            } else if (key > current.data) {
                System.out.println(key + " vs " + current.data + " -> go right");
                current = current.right;
            } else {
                System.out.println(key + " vs " + current.data + " -> found");
                return;
            }
        }
        System.out.println(key + " not found");
    }

    static void printTree(Node root, int level) {
        if (root == null) {
            return;
        }
        printTree(root.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(root.data);
        printTree(root.left, level + 1);
    }

    public static void main(String[] args) {
        int[] values = {50, 30, 70, 20, 40, 60, 80, 10, 25};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }

        List<Integer> inorderResult = new ArrayList<>();
        inorder(root, inorderResult);

        Node invalidRoot = new Node(50);
        invalidRoot.left = new Node(30);
        invalidRoot.right = new Node(70);
        invalidRoot.left.left = new Node(20);
        invalidRoot.left.right = new Node(65);
        invalidRoot.right.left = new Node(60);
        invalidRoot.right.right = new Node(80);

        Node skewedRoot = null;
        for (int value : Arrays.asList(10, 20, 25, 30, 40, 50, 60, 70, 80)) {
            skewedRoot = insert(skewedRoot, value);
        }

        System.out.println("a) Resulting BST:");
        printTree(root, 0);

        System.out.println("\nb) Comparisons while searching for 25:");
        searchWithTrace(root, 25);

        System.out.println("\nc) Inorder traversal: " + inorderResult);
        System.out.println("Is sorted? " + inorderResult.equals(Arrays.asList(10, 20, 25, 30, 40, 50, 60, 70, 80)));

        System.out.println("\nd) Is the given tree a valid BST? " + isValidBST(invalidRoot, Long.MIN_VALUE, Long.MAX_VALUE));
        System.out.println("Reason: 65 is in the left subtree of 50 but is greater than 50.");

        System.out.println("\ne) Height of constructed BST (in edges): " + heightInEdges(root));
        System.out.println("Height of completely skewed BST with 9 elements (in edges): " + heightInEdges(skewedRoot));
    }
}

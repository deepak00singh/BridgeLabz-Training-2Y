import java.util.ArrayList;
import java.util.List;

public class Problem4BSTOperations {
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

    static Node findMin(Node root) {
        Node current = root;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }

    static Node delete(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.data) {
            root.left = delete(root.left, value);
        } else if (value > root.data) {
            root.right = delete(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
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

    static void rangeQuery(Node root, int low, int high, List<Integer> output) {
        if (root == null) {
            return;
        }

        if (root.data > low) {
            rangeQuery(root.left, low, high, output);
        }
        if (root.data >= low && root.data <= high) {
            output.add(root.data);
        }
        if (root.data < high) {
            rangeQuery(root.right, low, high, output);
        }
    }

    static List<Integer> searchPath(Node root, int target) {
        List<Integer> path = new ArrayList<>();
        Node current = root;

        while (current != null) {
            path.add(current.data);
            if (target < current.data) {
                current = current.left;
            } else if (target > current.data) {
                current = current.right;
            } else {
                break;
            }
        }
        return path;
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
        int[] values = {15, 10, 20, 8, 12, 17, 25};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }

        System.out.println("Initial BST:");
        printTree(root, 0);

        System.out.println("\na) Delete node 10");
        Node node10 = root.left;
        Node successor = findMin(node10.right);
        System.out.println("Inorder successor of 10: " + successor.data);
        root = delete(root, 10);
        printTree(root, 0);

        System.out.println("\nb) Insert 14");
        System.out.println("Insertion path: 15 -> 12 -> right");
        root = insert(root, 14);
        printTree(root, 0);

        System.out.println("\nc) Insert 9");
        System.out.println("Insertion path: 15 -> 12 -> 8 -> right");
        root = insert(root, 9);
        printTree(root, 0);

        List<Integer> inRange = new ArrayList<>();
        rangeQuery(root, 10, 20, inRange);
        System.out.println("\nd) Students with roll numbers between 10 and 20: " + inRange);
        System.out.println("Most efficient traversal: inorder traversal with range pruning.");

        List<Integer> pathTo25 = searchPath(root, 25);
        System.out.println("\ne) Search path for 25: " + pathTo25);
        System.out.println("Best case time complexity: O(1)");
        System.out.println("Worst case time complexity: O(n)");
    }
}

import java.util.ArrayList;
import java.util.List;

public class Problem2TraversalApplication {
    static class FileNode {
        String name;
        FileNode left;
        FileNode right;

        FileNode(String name) {
            this.name = name;
        }
    }

    static void inorder(FileNode root, List<String> output) {
        if (root == null) {
            return;
        }
        inorder(root.left, output);
        output.add(root.name);
        inorder(root.right, output);
    }

    static void preorder(FileNode root, List<String> output) {
        if (root == null) {
            return;
        }
        output.add(root.name);
        preorder(root.left, output);
        preorder(root.right, output);
    }

    static void postorder(FileNode root, List<String> output) {
        if (root == null) {
            return;
        }
        postorder(root.left, output);
        postorder(root.right, output);
        output.add(root.name);
    }

    static void backupUsingPreorder(FileNode root) {
        if (root == null) {
            return;
        }
        System.out.println("Backing up: " + root.name);
        backupUsingPreorder(root.left);
        backupUsingPreorder(root.right);
    }

    static void deleteUsingPostorder(FileNode root) {
        if (root == null) {
            return;
        }
        deleteUsingPostorder(root.left);
        deleteUsingPostorder(root.right);
        System.out.println("Deleting: " + root.name);
    }

    public static void main(String[] args) {
        FileNode root = new FileNode("root");
        root.left = new FileNode("home");
        root.right = new FileNode("var");
        root.left.left = new FileNode("user");
        root.left.right = new FileNode("docs");
        root.right.right = new FileNode("log");
        root.left.left.left = new FileNode("config");

        List<String> inorderResult = new ArrayList<>();
        List<String> preorderResult = new ArrayList<>();
        List<String> postorderResult = new ArrayList<>();

        inorder(root, inorderResult);
        preorder(root, preorderResult);
        postorder(root, postorderResult);

        System.out.println("a) If this were a BST, use inorder traversal for alphabetical order.");
        System.out.println("b) Use postorder traversal to calculate directory size.");
        System.out.println("c) Use preorder traversal to create a backup from the root.");

        System.out.println("\nd) Traversals:");
        System.out.println("Inorder: " + inorderResult);
        System.out.println("Preorder: " + preorderResult);
        System.out.println("Postorder: " + postorderResult);

        System.out.println("\nBackup order using preorder:");
        backupUsingPreorder(root);

        System.out.println("\ne) Safe deletion order using postorder:");
        deleteUsingPostorder(root);
    }
}

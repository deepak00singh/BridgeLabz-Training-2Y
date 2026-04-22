import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem1TreeTerminology {
    static class EmployeeNode {
        String name;
        List<EmployeeNode> children;

        EmployeeNode(String name) {
            this.name = name;
            this.children = new ArrayList<>();
        }

        void addChild(EmployeeNode child) {
            children.add(child);
        }
    }

    static void collectLeafNodes(EmployeeNode root, List<String> leaves) {
        if (root == null) {
            return;
        }
        if (root.children.isEmpty()) {
            leaves.add(root.name);
            return;
        }
        for (EmployeeNode child : root.children) {
            collectLeafNodes(child, leaves);
        }
    }

    static int heightInEdges(EmployeeNode root) {
        if (root == null) {
            return -1;
        }

        int maxChildHeight = -1;
        for (EmployeeNode child : root.children) {
            maxChildHeight = Math.max(maxChildHeight, heightInEdges(child));
        }
        return maxChildHeight + 1;
    }

    static int depth(EmployeeNode root, String target, int currentDepth) {
        if (root == null) {
            return -1;
        }
        if (root.name.equals(target)) {
            return currentDepth;
        }

        for (EmployeeNode child : root.children) {
            int found = depth(child, target, currentDepth + 1);
            if (found != -1) {
                return found;
            }
        }
        return -1;
    }

    static boolean collectAncestors(EmployeeNode root, String target, List<String> ancestors) {
        if (root == null) {
            return false;
        }
        if (root.name.equals(target)) {
            return true;
        }

        for (EmployeeNode child : root.children) {
            if (collectAncestors(child, target, ancestors)) {
                ancestors.add(root.name);
                return true;
            }
        }
        return false;
    }

    static EmployeeNode findNode(EmployeeNode root, String target) {
        if (root == null) {
            return null;
        }
        if (root.name.equals(target)) {
            return root;
        }

        for (EmployeeNode child : root.children) {
            EmployeeNode found = findNode(child, target);
            if (found != null) {
                return found;
            }
        }
        return null;
    }

    static void printTree(EmployeeNode root, int level) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(root.name);

        for (EmployeeNode child : root.children) {
            printTree(child, level + 1);
        }
    }

    public static void main(String[] args) {
        EmployeeNode ceo = new EmployeeNode("CEO");
        EmployeeNode cto = new EmployeeNode("CTO");
        EmployeeNode cfo = new EmployeeNode("CFO");
        EmployeeNode devLead = new EmployeeNode("Dev Lead");
        EmployeeNode hr = new EmployeeNode("HR");
        EmployeeNode dev1 = new EmployeeNode("Dev1");
        EmployeeNode dev2 = new EmployeeNode("Dev2");

        ceo.addChild(cto);
        ceo.addChild(cfo);
        cto.addChild(devLead);
        cfo.addChild(hr);
        devLead.addChild(dev1);
        devLead.addChild(dev2);

        List<String> leafNodes = new ArrayList<>();
        collectLeafNodes(ceo, leafNodes);

        List<String> ancestorsOfDev1 = new ArrayList<>();
        collectAncestors(ceo, "Dev1", ancestorsOfDev1);
        Collections.reverse(ancestorsOfDev1);

        EmployeeNode ctoNode = findNode(ceo, "CTO");

        System.out.println("Company Organizational Tree:");
        printTree(ceo, 0);

        System.out.println("\nAnswers:");
        System.out.println("a) Leaf nodes: " + leafNodes);
        System.out.println("b) Height of tree (in edges): " + heightInEdges(ceo));
        System.out.println("c) Depth of Dev Lead: " + depth(ceo, "Dev Lead", 0));
        System.out.println("d) Ancestors of Dev1: " + ancestorsOfDev1);
        System.out.println("e) Degree of CTO: " + (ctoNode == null ? 0 : ctoNode.children.size()));
    }
}

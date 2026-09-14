public class CountLeafNodes {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int countLeafNodes(Node root) {

        if (root == null) {
            return 0;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return 1;
        }

        return countLeafNodes(root.left)
             + countLeafNodes(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        int result = countLeafNodes(root);

        System.out.println("Number of Leaf Nodes: " + result);
    }
}
public class SumOfBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return root.data + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Sum of nodes: " + sum(root));
    }
}
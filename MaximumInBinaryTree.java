public class MaximumInBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int maxValue(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = maxValue(root.left);
        int rightMax = maxValue(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Maximum value: " + maxValue(root));
    }
}

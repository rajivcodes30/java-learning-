public class MinimumInBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int minValue(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int leftMin = minValue(root.left);
        int rightMin = minValue(root.right);

        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Minimum value: " + minValue(root));
    }
}

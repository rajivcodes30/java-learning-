public class InvertBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node invert(Node root) {

        if (root == null) {
            return null;
        }

        // Swap left and right
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

        return root;
    }

    static void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Before Invert:");
        inorder(root);

        invert(root);

        System.out.println("\nAfter Invert:");
        inorder(root);
    }
}
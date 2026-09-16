public class IdenticalBinaryTrees {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static boolean isIdentical(Node root1, Node root2) {

        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.data != root2.data) {
            return false;
        }

        return isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {

        Node root1 = new Node(10);
        root1.left = new Node(20);
        root1.right = new Node(30);

        Node root2 = new Node(10);
        root2.left = new Node(20);
        root2.right = new Node(30);

        System.out.println("Are trees identical? "
                + isIdentical(root1, root2));
    }
}

public class LeftViewBinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void leftView(Node root, int level, int[] maxLevel) {

        if (root == null) {
            return;
        }

        if (level > maxLevel[0]) {
            System.out.print(root.data + " ");
            maxLevel[0] = level;
        }

        leftView(root.left, level + 1, maxLevel);
        leftView(root.right, level + 1, maxLevel);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.right = new Node(60);

        int[] maxLevel = {-1};

        System.out.print("Left View: ");
        leftView(root, 0, maxLevel);
    }
}
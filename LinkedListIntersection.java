public class LinkedListIntersection {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node common = new Node(30);
        common.next = new Node(40);
   
        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = common;

        Node second = new Node(15);
        second.next = common;

        Node result = getIntersection(first, second);

        if (result != null) {
            System.out.println("Intersection point: " + result.data);
        } else {
            System.out.println("No intersection found");
        }
    }

    public static Node getIntersection(Node first, Node second) {

        Node a = first;
        Node b = second;

        while (a != b) {

            if (a == null) {
                a = second;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = first;
            } else {
                b = b.next;
            }
        }

        return a;
    }
}
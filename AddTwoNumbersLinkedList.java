public class AddTwoNumbersLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node addNumbers(Node first, Node second) {

        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;

        while (first != null || second != null || carry != 0) {

            int sum = carry;

            if (first != null) {
                sum += first.data;
                first = first.next;
            }

            if (second != null) {
                sum += second.data;
                second = second.next;
            }

            current.next = new Node(sum % 10);
            carry = sum / 10;
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        Node first = new Node(2);
        first.next = new Node(4);
        first.next.next = new Node(3);

        Node second = new Node(5);
        second.next = new Node(6);
        second.next.next = new Node(4);

        Node result = addNumbers(first, second);

        System.out.print("Result: ");

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
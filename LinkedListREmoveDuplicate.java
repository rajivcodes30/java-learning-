public class LinkedListREmoveDuplicate {
    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(2);
        Node fourth = new Node(3);
        Node fifth = new Node(3);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node current = first;
        while (current != null && current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        System.out.println("Linked List after removing duplicates:");
        current = first;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

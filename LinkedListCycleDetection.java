public class LinkedListCycleDetection {

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;
        second.next = third;
        third.next = fourth;

        
        fourth.next = second;

        Node slow = first;
        Node fast = first;

        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (hasCycle) {
            System.out.println("Cycle detected in Linked List");
        } else {
            System.out.println("No cycle in Linked List");
        }
    }
}
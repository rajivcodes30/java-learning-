public class LinkedListNthFromEnd {
    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        int n = 2;
        Node fast = first;
        Node slow = first;

        for(int i = 0; i<n; i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println("The " + n + "th node from the end is: " + slow.data);
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedListDeletion {
     public static void main(String[] args) {
        
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        first.next = second;
        second.next = third;

        first = first.next;
         Node current = first;

         System.out.println("Linked List after deletion:");
         while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
         }
        }
    }
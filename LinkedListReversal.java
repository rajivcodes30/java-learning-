class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListReversal {

     public static void main(String[] args) {
       Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        Node prev = null;
        Node current = first;

        while (current != null) {
            Node nextNode = current.next; 
            current.next = prev;          
            prev = current;             
            current = nextNode;        

        }

        first = prev;

        System.out.println("Reversed Linked List:");
         
        Node currentNode = first;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }

    } 
}

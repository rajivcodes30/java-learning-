class Node{
     
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;

    }
}

public class LinkedListEndInsertion {
      
    public static void main(String[] args){

        Node first = new Node(10);
        Node second = new Node(20 );

        first.next = second;
        Node newNode = new Node(30);

        Node current = first;
         while (current.next != null){
            current = current.next;
         }
         current.next = newNode;

         System.out.println("Linked List after insertion at the end:");

            current = first;    
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
}

class  Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListSearch {
    
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(15);
        Node third = new Node(20);

        first.next = second;
        second.next = third;

        int target = 15;
        Node current = first;
        boolean found = false;

        while(current != null){
            if(current.data == target){
                found = true;
                break;
            
            }
            current = current.next;

        }

        if(found){
            System.out.println("Element " + target + " found in the linked list.");
        } else {
            System.out.println("Element " + target + " not found in the linked list.");
        }
    }
}
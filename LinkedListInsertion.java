 class Node{
     int data;
     Node next;

     Node(int data){
         this.data = data;
         this.next = null;
     }
    }
    
   public class LinkedListInsertion {
  public static void main(String[] args) {
       Node first = new Node(10);
       Node second = new Node(20);
         Node third = new Node(30);

         first.next = second;
            second.next = third;

                Node newNode = new Node(15);

                newNode.next = first.next;
                first.next = newNode;

                Node current = first;

                System.out.println("Linked List after insertion:");
                while(current != null){
                    System.out.print(current.data + " ");
                    current = current.next;
                }
            }
   }


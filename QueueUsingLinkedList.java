public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node front = null;
    static Node rear = null;

    static void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    static void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed: " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    static void display() {
        Node current = front;

        System.out.println("Queue:");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        display();

        dequeue();

        display();
    }
}

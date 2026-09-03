public class QueueUsingArray {

    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int data) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        queue[++rear] = data;
    }

    static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Removed: " + queue[front++]);
    }

    static void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        display();

        dequeue();
        dequeue();

        display();
    } 
}

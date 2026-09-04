public class CircularQueue {

    static int[] queue = new int[5];
    static int front = -1, rear = -1;

    static void enqueue(int data) {
        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = data;
    }

    static void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Removed: " + queue[front]);

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }

    static void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % queue.length;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        display();

        dequeue();
        dequeue();

        enqueue(50);
        enqueue(60);

        display();
    }
}
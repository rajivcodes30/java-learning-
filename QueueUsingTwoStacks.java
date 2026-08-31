import java.util.Stack;

public class QueueUsingTwoStacks {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    static void enqueue(int data) {
        stack1.push(data);
    }

    static void dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        System.out.println("Removed: " + stack2.pop());
    }

    static void display() {
        System.out.println("Queue: " + stack1 + " " + stack2);
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

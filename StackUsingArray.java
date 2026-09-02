public class StackUsingArray {

    static int[] stack = new int[5];
    static int top = -1;

    static void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = data;
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + stack[top--]);
    }

    static void display() {
        System.out.println("Stack:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        display();

        pop();

        display();
    }
}

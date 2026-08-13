import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    

      public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

 
        queue.add(10);
        queue.add(20);
        queue.add(30);

        
        System.out.println("Queue: " + queue);

        
        int removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        
        System.out.println("Queue after removal: " + queue);

        int frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);
      }
    }

import java.util.LinkedList;
import java.util.Queue;

class LinkedListQueue {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("Queue: " + queue);

        // Viewing the first element
        System.out.println("Front element: " + queue.peek());

        // Removing elements
        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after removal: " + queue);
    }
}

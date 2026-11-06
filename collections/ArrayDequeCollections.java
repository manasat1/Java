import java.util.ArrayDeque;
import java.util.Deque;

class ArrayDequeCollections {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // Adding elements at both ends
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        dq.addLast(30);

        System.out.println("Deque: " + dq);

        // Accessing first and last elements
        System.out.println("First element: " + dq.peekFirst());
        System.out.println("Last element: " + dq.peekLast());

        // Removing elements from both ends
        System.out.println("Removed first element: " + dq.removeFirst());
        System.out.println("Removed last element: " + dq.removeLast());

        System.out.println("Updated Deque: " + dq);

        // Using ArrayDeque as a Stack
        dq.push(100);
        dq.push(200);

        System.out.println("After push: " + dq);
        System.out.println("Stack pop: " + dq.pop());

        System.out.println("Final Deque: " + dq);
    }
}

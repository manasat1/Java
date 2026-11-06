import java.util.LinkedList;
import java.util.Queue;

class QueueCollections {

    public static void main(String[] args) {

        Queue<Integer> qu = new LinkedList<>();

        // Adding elements
        qu.add(210);
        qu.add(220);
        qu.add(230);
        qu.add(240);
        qu.add(250);

        // Accessing the first element
        System.out.println("First element: " + qu.element());

        // Removing elements from the queue
        System.out.println("Removing elements:");

        while (!qu.isEmpty()) {
            System.out.println(qu.remove());
        }

        System.out.println("Is queue empty: " + qu.isEmpty());
    }
}

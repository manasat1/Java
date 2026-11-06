import java.util.PriorityQueue;

class PriorityQueueCollections {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        pq.add(30);

        // Displaying the head element
        System.out.println("Highest priority element: " + pq.peek());

        // Removing elements according to priority
        System.out.println("Removing elements:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        System.out.println("Is queue empty: " + pq.isEmpty());
    }
}

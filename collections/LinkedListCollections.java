import java.util.Iterator;
import java.util.LinkedList;

class LinkedListCollections {

    public static void main(String[] args) {

        LinkedList<String> foods = new LinkedList<>();

        foods.add("Chocolate");
        foods.add("Biscuit");
        foods.add("Ice Cream");
        foods.add("Chips");
        foods.add("Cool Drinks");

        // Adding elements at specific positions
        foods.add(2, "Pizza");
        foods.addFirst("Burger");

        System.out.println("First element: " + foods.getFirst());
        System.out.println("Last element: " + foods.getLast());

        // Forward iteration
        System.out.println("Forward order:");

        Iterator<String> itr = foods.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Reverse iteration
        System.out.println("Reverse order:");

        itr = foods.descendingIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

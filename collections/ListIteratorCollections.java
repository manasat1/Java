import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorCollections {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Radha");
        names.add("Anjali");
        names.add("Priya");
        names.add("Sneha");

        // Creating ListIterator
        ListIterator<String> itr = names.listIterator();

        // Forward traversal
        System.out.println("Forward traversal:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Backward traversal
        System.out.println("Backward traversal:");

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        // Updating an element
        itr.next();
        itr.set("Divya");

        // Adding an element
        itr.add("Kavya");

        System.out.println("After updating and adding: " + names);
    }
}

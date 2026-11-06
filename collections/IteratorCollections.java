import java.util.ArrayList;
import java.util.Iterator;

class IteratorCollections {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Manasa");
        names.add("Anjali");
        names.add("Priya");
        names.add("Sneha");
        names.add("Divya");

        // Creating Iterator
        Iterator<String> itr = names.iterator();

        System.out.println("ArrayList elements:");

        // Traversing using Iterator
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Removing an element using Iterator
        Iterator<String> itr2 = names.iterator();

        while (itr2.hasNext()) {
            String name = itr2.next();

            if (name.equals("Priya")) {
                itr2.remove();
            }
        }

        System.out.println("After removing Priya: " + names);
    }
}

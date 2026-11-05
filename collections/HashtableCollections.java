import java.util.Enumeration;
import java.util.Hashtable;

class HashtableCollections {

    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

        // Adding key-value pairs
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Three");
        ht.put(4, "Four");
        ht.put(5, "Five");

        // Accessing value using key
        System.out.println("Value of key 2: " + ht.get(2));

        // Iterating through keys using Enumeration
        System.out.println("Hashtable keys:");

        Enumeration<Integer> e = ht.keys();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // Checking whether key exists
        System.out.println("Contains key 3: " + ht.containsKey(3));

        // Removing an entry
        ht.remove(4);

        System.out.println("After removing key 4: " + ht);
    }
}

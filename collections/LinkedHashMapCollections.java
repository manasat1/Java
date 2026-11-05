import java.util.LinkedHashMap;

class LinkedHashMapCollections {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();

        // Adding key-value pairs
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "Four");
        hm.put(5, "Five");

        System.out.println("LinkedHashMap: " + hm);

        // Accessing value
        System.out.println("Value of key 3: " + hm.get(3));

        // Updating a value
        hm.put(2, "Twenty");

        System.out.println("After updating: " + hm);

        // Removing an entry
        hm.remove(4);

        System.out.println("After removing key 4: " + hm);

        // Iterating through entries
        System.out.println("Key-Value pairs:");

        for (Integer key : hm.keySet()) {
            System.out.println(key + " = " + hm.get(key));
        }
    }
}

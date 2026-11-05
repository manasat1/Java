import java.util.HashMap;

class HashMapCollections {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        // Adding key-value pairs
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "Four");
        hm.put(5, "Five");

        // Accessing value using key
        System.out.println("Value of key 2: " + hm.get(2));

        // Displaying HashMap
        System.out.println("HashMap: " + hm);

        // Checking whether key exists
        System.out.println("Contains key 3: " + hm.containsKey(3));

        // Checking whether value exists
        System.out.println("Contains value Four: "
                + hm.containsValue("Four"));

        // Updating a value
        hm.put(2, "Twenty");

        System.out.println("After updating: " + hm);

        // Removing an entry
        hm.remove(4);

        System.out.println("After removing key 4: " + hm);

        System.out.println("Size: " + hm.size());
    }
}

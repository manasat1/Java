import java.util.TreeMap;

class TreeMapCollections {

    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>();

        // Adding key-value pairs
        tm.put(5, "Five");
        tm.put(2, "Two");
        tm.put(4, "Four");
        tm.put(1, "One");
        tm.put(3, "Three");

        System.out.println("TreeMap: " + tm);

        // Accessing values
        System.out.println("Value of key 3: " + tm.get(3));

        // First and last keys
        System.out.println("First key: " + tm.firstKey());
        System.out.println("Last key: " + tm.lastKey());

        // Checking key
        System.out.println("Contains key 4: " + tm.containsKey(4));

        // Removing an entry
        tm.remove(2);

        System.out.println("After removing key 2: " + tm);

        // Iterating through entries
        System.out.println("Key-Value pairs:");

        for (Integer key : tm.keySet()) {
            System.out.println(key + " = " + tm.get(key));
        }
    }
}

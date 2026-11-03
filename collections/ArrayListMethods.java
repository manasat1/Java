import java.util.ArrayList;

class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        // Checking whether an element exists
        System.out.println("Contains Mango: "
                + fruits.contains("Mango"));

        // Finding the size
        System.out.println("Size: " + fruits.size());

        // Updating an element
        fruits.set(1, "Grapes");

        System.out.println("After updating: " + fruits);

        // Removing an element
        fruits.remove("Orange");

        System.out.println("After removing: " + fruits);

        // Checking whether the list is empty
        System.out.println("Is list empty: " + fruits.isEmpty());

        // Clearing all elements
        fruits.clear();

        System.out.println("After clearing: " + fruits);
        System.out.println("Is list empty: " + fruits.isEmpty());
    }
}

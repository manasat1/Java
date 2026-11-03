import java.util.ArrayList;
import java.util.LinkedHashSet;

class ArrayListRemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        // Removing duplicates
        LinkedHashSet<String> set = new LinkedHashSet<>(fruits);

        // Converting back to ArrayList
        ArrayList<String> uniqueFruits = new ArrayList<>(set);

        System.out.println("After Removing Duplicates: "
                + uniqueFruits);
    }
}

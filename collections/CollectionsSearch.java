import java.util.ArrayList;
import java.util.Collections;

class CollectionsSearch {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original List: " + numbers);

        // Sorting the list
        Collections.sort(numbers);

        System.out.println("Sorted List: " + numbers);

        // Searching for an existing element
        int index1 = Collections.binarySearch(numbers, 30);

        System.out.println("Index of 30: " + index1);

        // Searching for another existing element
        int index2 = Collections.binarySearch(numbers, 50);

        System.out.println("Index of 50: " + index2);

        // Searching for a missing element
        int index3 = Collections.binarySearch(numbers, 60);

        System.out.println("Index of 60: " + index3);
    }
}

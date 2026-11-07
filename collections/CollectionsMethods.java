import java.util.ArrayList;
import java.util.Collections;

class CollectionsMethods {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original List: " + numbers);

        // Sorting elements
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);

        // Reversing elements
        Collections.reverse(numbers);
        System.out.println("After reversing: " + numbers);

        // Finding minimum element
        System.out.println("Minimum element: " + Collections.min(numbers));

        // Finding maximum element
        System.out.println("Maximum element: " + Collections.max(numbers));

        // Swapping elements
        Collections.swap(numbers, 0, 4);
        System.out.println("After swapping: " + numbers);

        // Replacing all occurrences
        Collections.replaceAll(numbers, 20, 100);
        System.out.println("After replacing 20 with 100: " + numbers);

        // Counting occurrences
        System.out.println("Frequency of 100: " +
                Collections.frequency(numbers, 100));
    }
}

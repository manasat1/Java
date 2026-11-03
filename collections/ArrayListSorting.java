import java.util.ArrayList;
import java.util.Collections;

class ArrayListSorting {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Original List: " + numbers);

        // Sorting in ascending order
        Collections.sort(numbers);

        System.out.println("Ascending Order: " + numbers);

        // Sorting in descending order
        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("Descending Order: " + numbers);
    }
}

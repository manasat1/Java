import java.util.ArrayList;
import java.util.Collections;

class CollectionsReverse {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Reversing using Collections.reverse()
        Collections.reverse(numbers);

        System.out.println("Reversed using Collections: " + numbers);

        // Reversing manually
        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversed.add(numbers.get(i));
        }

        System.out.println("Reversed manually: " + reversed);
    }
}

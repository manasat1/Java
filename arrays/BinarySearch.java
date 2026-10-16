import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int key = 30;

        int index = Arrays.binarySearch(numbers, key);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}

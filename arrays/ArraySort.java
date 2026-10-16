import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] numbers = {50, 20, 40, 10, 30};

        Arrays.sort(numbers);

        System.out.println("Sorted Array:");

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}

public class ArrayInsertElement {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};
        int element = 25;
        int position = 2;

        int[] result = new int[numbers.length + 1];

        for (int i = 0; i < position; i++) {
            result[i] = numbers[i];
        }

        result[position] = element;

        for (int i = position; i < numbers.length; i++) {
            result[i + 1] = numbers[i];
        }

        System.out.println("Array after insertion:");

        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}

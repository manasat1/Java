public class RotateArrayRight {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int last = numbers[numbers.length - 1];

        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[0] = last;

        System.out.print("Right rotated array: ");

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

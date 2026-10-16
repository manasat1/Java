public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] numbers = {0, 10, 0, 20, 30, 0, 40};

        int index = 0;

        for (int n : numbers) {
            if (n != 0) {
                numbers[index] = n;
                index++;
            }
        }

        while (index < numbers.length) {
            numbers[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros:");

        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}

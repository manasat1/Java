public class MissingNumber {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5, 6};

        int n = 6;

        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        int missing = total - sum;

        System.out.println("Missing number: " + missing);
    }
}

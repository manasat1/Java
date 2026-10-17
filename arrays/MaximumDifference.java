public class MaximumDifference {

    public static void main(String[] args) {

        int[] numbers = {7, 1, 5, 3, 6, 4};

        int min = numbers[0];
        int maxDifference = numbers[1] - numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            int difference = numbers[i] - min;

            if (difference > maxDifference) {
                maxDifference = difference;
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum difference: " + maxDifference);
    }
}

public class MatrixMaxRowSum {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3},
            {10, 20, 30},
            {4, 5, 6}
        };

        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        for (int i = 0; i < numbers.length; i++) {

            int sum = 0;

            for (int j = 0; j < numbers[i].length; j++) {
                sum = sum + numbers[i][j];
            }

            System.out.println("Row " + i + " sum: " + sum);

            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("Row with maximum sum: " + maxRow);
        System.out.println("Maximum row sum: " + maxSum);
    }
}

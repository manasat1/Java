public class MatrixMaxColumnSum {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 20, 3},
            {4, 50, 6},
            {7, 80, 9}
        };

        int maxSum = Integer.MIN_VALUE;
        int maxColumn = -1;

        for (int j = 0; j < numbers[0].length; j++) {

            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i][j];
            }

            System.out.println("Column " + j + " sum: " + sum);

            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = j;
            }
        }

        System.out.println("Column with maximum sum: " + maxColumn);
        System.out.println("Maximum column sum: " + maxSum);
    }
}

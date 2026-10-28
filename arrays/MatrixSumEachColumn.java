public class MatrixSumEachColumn {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int cols = numbers[0].length;
        int[] colSums = new int[cols];

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < numbers.length; i++) {
                colSums[j] += numbers[i][j];
            }
        }

        System.out.println("Sum of each column:");

        for (int j = 0; j < colSums.length; j++) {
            System.out.println("Column " + j + ": " + colSums[j]);
        }
    }
}

public class MatrixSumEachRow {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] rowSums = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                rowSums[i] += numbers[i][j];
            }
        }

        System.out.println("Sum of each row:");

        for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Row " + i + ": " + rowSums[i]);
        }
    }
}

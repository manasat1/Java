public class MatrixBothDiagonalSum {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = numbers.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += numbers[i][i];
            secondarySum += numbers[i][n - 1 - i];
        }

        System.out.println("Primary diagonal sum: " + primarySum);
        System.out.println("Secondary diagonal sum: " + secondarySum);
    }
}

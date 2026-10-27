public class MatrixBoundarySum {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int rows = numbers.length;
        int cols = numbers[0].length;
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (i == 0 || i == rows - 1 ||
                    j == 0 || j == cols - 1) {

                    sum += numbers[i][j];
                }
            }
        }

        System.out.println("Sum of boundary elements: " + sum);
    }
}

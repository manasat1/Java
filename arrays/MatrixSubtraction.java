public class MatrixSubtraction {

    public static void main(String[] args) {

        int[][] first = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int[][] second = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = first.length;
        int cols = first[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = first[i][j] - second[i][j];
            }
        }

        System.out.println("Matrix Subtraction Result:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

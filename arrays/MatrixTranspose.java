public class MatrixTranspose {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = numbers.length;
        int columns = numbers[0].length;

        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                transpose[j][i] = numbers[i][j];
            }
        }

        System.out.println("Transpose of Matrix:");

        for (int i = 0; i < transpose.length; i++) {

            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }

            System.out.println();
        }
    }
}

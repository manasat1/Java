public class MatrixBelowDiagonal {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Elements Below Main Diagonal:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (i > j) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
    }
}

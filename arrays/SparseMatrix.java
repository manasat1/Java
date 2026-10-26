public class SparseMatrix {

    public static void main(String[] args) {

        int[][] numbers = {
            {0, 0, 3},
            {0, 0, 0},
            {7, 0, 0}
        };

        int zeros = 0;
        int nonZeros = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] == 0) {
                    zeros++;
                } else {
                    nonZeros++;
                }
            }
        }

        if (zeros > nonZeros) {
            System.out.println("The matrix is a sparse matrix");
        } else {
            System.out.println("The matrix is not a sparse matrix");
        }

        System.out.println("Zero elements: " + zeros);
        System.out.println("Non-zero elements: " + nonZeros);
    }
}

public class CountMatrixZeros {

    public static void main(String[] args) {

        int[][] numbers = {
            {0, 2, 3},
            {4, 0, 6},
            {0, 8, 9}
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

        System.out.println("Number of zeros: " + zeros);
        System.out.println("Number of non-zero elements: " + nonZeros);
    }
}

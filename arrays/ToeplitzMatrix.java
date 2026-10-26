public class ToeplitzMatrix {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3, 4},
            {5, 1, 2, 3},
            {6, 5, 1, 2}
        };

        boolean toeplitz = true;

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 1; j < numbers[i].length; j++) {

                if (numbers[i][j] != numbers[i - 1][j - 1]) {
                    toeplitz = false;
                    break;
                }
            }

            if (!toeplitz) {
                break;
            }
        }

        if (toeplitz) {
            System.out.println("The matrix is a Toeplitz matrix");
        } else {
            System.out.println("The matrix is not a Toeplitz matrix");
        }
    }
}

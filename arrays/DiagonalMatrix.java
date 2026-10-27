public class DiagonalMatrix {

    public static void main(String[] args) {

        int[][] numbers = {
            {5, 0, 0},
            {0, 8, 0},
            {0, 0, 3}
        };

        boolean diagonal = true;

        if (numbers.length != numbers[0].length) {
            diagonal = false;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {

                    if (i != j && numbers[i][j] != 0) {
                        diagonal = false;
                        break;
                    }
                }

                if (!diagonal) {
                    break;
                }
            }
        }

        if (diagonal) {
            System.out.println("The matrix is a diagonal matrix");
        } else {
            System.out.println("The matrix is not a diagonal matrix");
        }
    }
}

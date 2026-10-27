public class CheckIdentityMatrix {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean identity = true;

        if (numbers.length != numbers[0].length) {
            identity = false;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {

                    if (i == j && numbers[i][j] != 1) {
                        identity = false;
                        break;
                    }

                    if (i != j && numbers[i][j] != 0) {
                        identity = false;
                        break;
                    }
                }

                if (!identity) {
                    break;
                }
            }
        }

        if (identity) {
            System.out.println("The matrix is an identity matrix");
        } else {
            System.out.println("The matrix is not an identity matrix");
        }
    }
}

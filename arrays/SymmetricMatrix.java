public class SymmetricMatrix {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        boolean symmetric = true;

        if (numbers.length != numbers[0].length) {
            symmetric = false;
        } else {

            for (int i = 0; i < numbers.length; i++) {

                for (int j = i + 1; j < numbers.length; j++) {

                    if (numbers[i][j] != numbers[j][i]) {
                        symmetric = false;
                        break;
                    }
                }

                if (!symmetric) {
                    break;
                }
            }
        }

        if (symmetric) {
            System.out.println("Symmetric matrix");
        } else {
            System.out.println("Not a symmetric matrix");
        }
    }
}

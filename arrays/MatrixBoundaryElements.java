public class MatrixBoundaryElements {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Boundary elements:");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (i == 0 || i == numbers.length - 1 ||
                    j == 0 || j == numbers[i].length - 1) {

                    System.out.print(numbers[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

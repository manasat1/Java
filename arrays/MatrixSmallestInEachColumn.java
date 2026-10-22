public class MatrixSmallestInEachColumn {

    public static void main(String[] args) {

        int[][] numbers = {
            {10, 25, 15},
            {40, 20, 35},
            {12, 50, 30}
        };

        for (int j = 0; j < numbers[0].length; j++) {

            int smallest = numbers[0][j];

            for (int i = 1; i < numbers.length; i++) {

                if (numbers[i][j] < smallest) {
                    smallest = numbers[i][j];
                }
            }

            System.out.println(
                "Smallest in column " + (j + 1) + ": " + smallest
            );
        }
    }
}

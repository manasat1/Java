public class MatrixLargestInEachRow {

    public static void main(String[] args) {

        int[][] numbers = {
            {10, 25, 15},
            {40, 20, 35},
            {12, 50, 30}
        };

        for (int i = 0; i < numbers.length; i++) {

            int largest = numbers[i][0];

            for (int j = 1; j < numbers[i].length; j++) {

                if (numbers[i][j] > largest) {
                    largest = numbers[i][j];
                }
            }

            System.out.println(
                "Largest in row " + (i + 1) + ": " + largest
            );
        }
    }
}

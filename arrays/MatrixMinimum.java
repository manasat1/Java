public class MatrixMinimum {

    public static void main(String[] args) {

        int[][] numbers = {
            {12, 45, 23},
            {67, 34, 89},
            {56, 91, 7}
        };

        int min = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
            }
        }

        System.out.println("Minimum element: " + min);
    }
}

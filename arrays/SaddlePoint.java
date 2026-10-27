public class SaddlePoint {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = numbers.length;
        int cols = numbers[0].length;
        boolean found = false;

        for (int i = 0; i < rows; i++) {

            int minCol = 0;

            for (int j = 1; j < cols; j++) {
                if (numbers[i][j] < numbers[i][minCol]) {
                    minCol = j;
                }
            }

            int value = numbers[i][minCol];
            boolean largest = true;

            for (int k = 0; k < rows; k++) {
                if (numbers[k][minCol] > value) {
                    largest = false;
                    break;
                }
            }

            if (largest) {
                System.out.println("Saddle point: " + value);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No saddle point found");
        }
    }
}

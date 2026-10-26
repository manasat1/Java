public class RotateMatrix90Anticlockwise {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = numbers.length;

        System.out.println("Matrix Rotated 90 Degrees Anticlockwise:");

        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

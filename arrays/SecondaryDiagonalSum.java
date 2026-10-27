public class SecondaryDiagonalSum {

    public static void main(String[] args) {

        int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int n = numbers.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += numbers[i][n - 1 - i];
        }

        System.out.println("Secondary diagonal sum: " + sum);
    }
}

public class MainDiagonalSum {

    public static void main(String[] args) {

        int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i][i];
        }

        System.out.println("Main diagonal sum: " + sum);
    }
}

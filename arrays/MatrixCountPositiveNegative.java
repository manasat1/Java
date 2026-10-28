public class MatrixCountPositiveNegative {

    public static void main(String[] args) {

        int[][] numbers = {
            {10, -5, 0},
            {-8, 12, 7},
            {0, -3, 6}
        };

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] > 0) {
                    positive++;
                } else if (numbers[i][j] < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }
        }

        System.out.println("Positive elements: " + positive);
        System.out.println("Negative elements: " + negative);
        System.out.println("Zero elements: " + zero);
    }
}

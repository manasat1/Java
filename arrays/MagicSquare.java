public class MagicSquare {

    public static void main(String[] args) {

        int[][] numbers = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        int n = numbers.length;
        int sum = 0;
        boolean magic = true;

        for (int j = 0; j < n; j++) {
            sum += numbers[0][j];
        }

        for (int i = 0; i < n; i++) {

            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += numbers[i][j];
                colSum += numbers[j][i];
            }

            if (rowSum != sum || colSum != sum) {
                magic = false;
                break;
            }
        }

        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < n; i++) {
            diagonal1 += numbers[i][i];
            diagonal2 += numbers[i][n - 1 - i];
        }

        if (diagonal1 != sum || diagonal2 != sum) {
            magic = false;
        }

        if (magic) {
            System.out.println("The matrix is a magic square");
            System.out.println("Magic sum: " + sum);
        } else {
            System.out.println("The matrix is not a magic square");
        }
    }
}

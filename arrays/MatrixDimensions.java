public class MatrixDimensions {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int rows = numbers.length;
        int columns = numbers[0].length;

        System.out.println("Number of rows: " + rows);
        System.out.println("Number of columns: " + columns);
    }
}

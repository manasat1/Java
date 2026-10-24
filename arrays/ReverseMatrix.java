public class ReverseMatrix {

    public static void main(String[] args) {

        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix in Reverse Order:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = numbers[i].length - 1; j >= 0; j--) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

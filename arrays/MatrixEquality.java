public class MatrixEquality {

    public static void main(String[] args) {

        int[][] first = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] second = {
            {1, 2, 3},
            {4, 5, 6}
        };

        boolean equal = true;

        if (first.length != second.length) {
            equal = false;
        } else {
            for (int i = 0; i < first.length; i++) {

                if (first[i].length != second[i].length) {
                    equal = false;
                    break;
                }

                for (int j = 0; j < first[i].length; j++) {
                    if (first[i][j] != second[i][j]) {
                        equal = false;
                        break;
                    }
                }

                if (!equal) {
                    break;
                }
            }
        }

        if (equal) {
            System.out.println("Matrices are equal");
        } else {
            System.out.println("Matrices are not equal");
        }
    }
}

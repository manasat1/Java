public class CountPositiveNegativeZero {

    public static void main(String[] args) {

        int[] a = {10, -5, 0, 20, -15, 0, 8};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int n : a) {

            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }
}

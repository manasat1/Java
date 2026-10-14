public class CountElementOccurrences {

    public static void main(String[] args) {

        int[] a = {10, 20, 10, 30, 10, 40, 20};

        int target = 10;
        int count = 0;

        for (int n : a) {

            if (n == target) {
                count++;
            }
        }

        System.out.println("Target element: " + target);
        System.out.println("Number of occurrences: " + count);
    }
}

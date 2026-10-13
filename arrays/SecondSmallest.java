public class SecondSmallest {

    public static void main(String[] args) {

        int[] a = {25, 10, 75, 40, 60};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int n : a) {

            if (n < smallest) {
                secondSmallest = smallest;
                smallest = n;
            } else if (n < secondSmallest && n > smallest) {
                secondSmallest = n;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest distinct element not found");
        } else {
            System.out.println("Second smallest element: " + secondSmallest);
        }
    }
}

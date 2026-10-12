public class ArraySmallest {

    public static void main(String[] args) {

        int[] a = {25, 10, 75, 40, 60};

        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
    }
}

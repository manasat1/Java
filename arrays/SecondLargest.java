
public class SecondLargest {

    public static void main(String[] args) {

        int[] a = {25, 10, 75, 40, 60};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int n : a) {

            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n < largest) {
                secondLargest = n;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest distinct element not found");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}

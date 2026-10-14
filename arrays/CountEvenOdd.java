public class CountEvenOdd {

    public static void main(String[] args) {

        int[] a = {10, 15, 20, 25, 30, 35};

        int evenCount = 0;
        int oddCount = 0;

        for (int n : a) {

            if (n % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

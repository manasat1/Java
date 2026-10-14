public class ReverseArray {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");

        for (int n : a) {
            System.out.print(n + " ");
        }

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        System.out.println("\nReversed Array:");

        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}

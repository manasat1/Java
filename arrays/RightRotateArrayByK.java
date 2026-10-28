public class RightRotateArrayByK {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int k = 2;
        int n = numbers.length;

        k = k % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = numbers[i];
        }

        System.out.print("Right rotated array: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

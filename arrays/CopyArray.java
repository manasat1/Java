public class CopyArray {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println("Original Array:");

        for (int n : a) {
            System.out.print(n + " ");
        }

        System.out.println("\nCopied Array:");

        for (int n : b) {
            System.out.print(n + " ");
        }
    }
}

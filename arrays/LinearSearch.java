public class LinearSearch {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};

        int target = 30;
        int index = -1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}

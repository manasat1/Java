public class FindElementIndex {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 20, 40, 20};

        int target = 20;
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == target) {
                count++;

                if (count == 2) {
                    System.out.println("Second occurrence found at index: " + i);
                    break;
                }
            }
        }

        if (count < 2) {
            System.out.println("Second occurrence not found");
        }
    }
}

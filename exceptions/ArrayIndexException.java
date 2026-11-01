class ArrayIndexException {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.println("Array element: " + arr[2]);

            System.out.println("Invalid element: " + arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }

        System.out.println("Program completed");
    }
}

class NestedTryCatch {

    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};

            try {
                int result = 10 / 0;
                System.out.println(result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        }

        System.out.println("Program completed");
    }
}

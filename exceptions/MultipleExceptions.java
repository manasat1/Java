class MultipleExceptions {

    static void calculate(int choice) {

        try {
            int[] arr = {10, 20, 30};

            if (choice == 1) {
                int result = 10 / 0;
                System.out.println(result);

            } else if (choice == 2) {
                System.out.println(arr[5]);

            } else {
                System.out.println("Valid operation");
            }

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }

    public static void main(String[] args) {

        calculate(1);
        calculate(2);
        calculate(3);

        System.out.println("Program completed");
    }
}

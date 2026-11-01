class FinallyWithoutException {

    public static void main(String[] args) {

        try {
            int a = 20;
            int b = 5;

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program completed");
    }
}

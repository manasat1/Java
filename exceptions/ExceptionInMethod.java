class ExceptionInMethod {

    static void divide(int a, int b) {

        try {
            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }

    static void calculate() {
        divide(20, 5);
        divide(10, 0);
    }

    public static void main(String[] args) {

        calculate();

        System.out.println("Program completed");
    }
}

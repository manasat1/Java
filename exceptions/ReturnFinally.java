class ReturnFinally {

    static int calculate() {

        try {
            System.out.println("Inside try block");
            return 10;

        } finally {
            System.out.println("Inside finally block");
        }
    }

    public static void main(String[] args) {

        int result = calculate();

        System.out.println("Result: " + result);
        System.out.println("Program completed");
    }
}

class ExceptionChaining {

    static void processData() {

        try {
            int result = 10 / 0;

        } catch (ArithmeticException e) {

            throw new RuntimeException(
                "Error occurred while processing data", e
            );
        }
    }

    public static void main(String[] args) {

        try {
            processData();

        } catch (RuntimeException e) {

            System.out.println(e.getMessage());

            System.out.println("Original cause: "
                    + e.getCause().getClass().getSimpleName());

            System.out.println("Cause message: "
                    + e.getCause().getMessage());
        }

        System.out.println("Program completed");
    }
}

class ExceptionHierarchy {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");

            System.out.println("Parent class: "
                    + e.getClass().getSuperclass().getSimpleName());
        }

        System.out.println("Program completed");
    }
}

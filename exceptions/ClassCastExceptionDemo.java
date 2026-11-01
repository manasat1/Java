class ClassCastExceptionDemo {

    public static void main(String[] args) {

        try {
            Object obj = "Hello Java";

            Integer number = (Integer) obj;

            System.out.println(number);

        } catch (ClassCastException e) {
            System.out.println("Invalid type casting");
        }

        System.out.println("Program completed");
    }
}

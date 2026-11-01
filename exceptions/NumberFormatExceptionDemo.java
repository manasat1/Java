class NumberFormatExceptionDemo {

    public static void main(String[] args) {

        String str = "123ABC";

        try {
            int number = Integer.parseInt(str);

            System.out.println("Number: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        System.out.println("Program completed");
    }
}

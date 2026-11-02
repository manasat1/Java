class NumberFormatMultipleCatch {

    public static void main(String[] args) {

        String[] values = {"123", "ABC", "456"};

        try {
            for (int i = 0; i < values.length; i++) {

                int number = Integer.parseInt(values[i]);

                System.out.println("Number: " + number);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");

        } catch (Exception e) {
            System.out.println("Unexpected error");
        }

        System.out.println("Program completed");
    }
}

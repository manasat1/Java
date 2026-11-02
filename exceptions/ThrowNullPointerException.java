class ThrowNullPointerException {

    static void checkName(String name) {

        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }

        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        try {
            checkName(null);

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program completed");
    }
}

public class MethodOverloading {

    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Same method name with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Same method name with different data types
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();

        System.out.println("Addition of 2 numbers: " + mo.add(10, 20));
        System.out.println("Addition of 3 numbers: " + mo.add(10, 20, 30));
        System.out.println("Addition of decimal numbers: " + mo.add(10.5, 20.5));
    }
}

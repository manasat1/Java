class VarargsOverloading {

    public static void main(String[] args) {

        Addition a = new Addition();

        System.out.println("Addition of two numbers: "
                + a.add(10, 20));

        System.out.println("Addition using varargs: "
                + a.add(10, 20, 30));

        System.out.println("Addition using varargs: "
                + a.add(10, 20, 30, 40, 50));
    }
}

class Addition {

    // Method with two parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with variable number of parameters
    public int add(int... numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}

class AdditionOverloading {

    public static void main(String[] args) {

        Addition a = new Addition();

        System.out.println("Addition of 2 numbers: " + a.add(10, 20));

        System.out.println("Addition of 3 numbers: " + a.add(10, 20, 30));

        System.out.println("Addition of 4 numbers: " + a.add(10, 20, 30, 40));

        System.out.println("Addition of 5 numbers: " + a.add(10, 20, 30, 40, 50));
    }
}

class Addition {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int add(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
}

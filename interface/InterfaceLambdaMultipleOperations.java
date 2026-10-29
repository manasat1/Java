interface IMath2 {
    int calc(int x, int y);
}

class InterfaceLambdaMultipleOperations {

    public static void main(String[] args) {

        IMath2 m1, m2;

        m1 = (x, y) -> x + y;
        m2 = (x, y) -> x - y;

        System.out.println("Addition: " + m1.calc(100, 200));
        System.out.println("Subtraction: " + m2.calc(500, 300));
    }
}

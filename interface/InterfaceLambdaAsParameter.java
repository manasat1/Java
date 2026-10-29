interface IMath {
    int calc(int x, int y);
}

class Calculator {

    public int calculate(IMath m, int a, int b) {
        return m.calc(a, b);
    }
}

class InterfaceLambdaAsParameter {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition: " +
            c.calculate((x, y) -> x + y, 100, 200));

        System.out.println("Subtraction: " +
            c.calculate((x, y) -> x - y, 34, 12));

        IMath m = (x, y) -> x - y;

        System.out.println("Subtraction using interface reference: " +
            c.calculate(m, 20, 10));
    }
}

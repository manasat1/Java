class MathFunctionOverloading {

    public static void main(String[] args) {

        Calculator m = new Calculator();

        System.out.println(m.sum(5, 10));
        System.out.println(m.sum(10.2f, 2.0f));
        System.out.println(m.sum(7, 5));
        System.out.println(m.sum(7.5, 2.5));
        System.out.println(m.sum(8, "3"));
        System.out.println(m.sum("4", 6));
        System.out.println(m.sum("1", "2"));
    }
}

class Calculator {

    public int sum(int x, int y) {
        return x + y;
    }

    public float sum(float x, float y) {
        return x + y;
    }

    public double sum(double x, double y) {
        return x + y;
    }

    public int sum(int x, String y) {
        return x + Integer.parseInt(y);
    }

    public int sum(String x, int y) {
        return Integer.parseInt(x) + y;
    }

    public String sum(String x, String y) {
        return x + y;
    }
}

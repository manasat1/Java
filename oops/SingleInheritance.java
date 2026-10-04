class Math2024 {

    public int sum(int x, int y) {
        return (x + y);
    }

    protected int subt(int x, int y) {
        return (x - y);
    }
}

class Math2025 extends Math2024 {

    public int mult(int x, int y) {
        return (x * y);
    }

    public int subtract(int x, int y) {
        return subt(x, y);
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Math2024 m1;
        Math2025 m2;

        m1 = new Math2024();
        m2 = new Math2025();

        System.out.println(m1.sum(10, 20));
        System.out.println(m1.subt(20, 10));
        System.out.println(m2.sum(1, 20));
        System.out.println(m2.subt(100, 20));
        System.out.println(m2.mult(10, 5));
        System.out.println(m2.subtract(30, 20));
    }
}

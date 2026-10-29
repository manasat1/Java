interface IMath2020 {
    int sum(int x, int y);
}

interface IMath2022 extends IMath2020 {
    int subt(int x, int y);
}

interface IMath2025 {
    int mult(int x, int y);
}

class SimpleMath implements IMath2022, IMath2025 {

    public int sum(int x, int y) {
        return x + y;
    }

    public int subt(int x, int y) {
        return x - y;
    }

    public int mult(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }
}

class InterfaceInheritance {
    public static void main(String[] args) {

        SimpleMath m = new SimpleMath();

        System.out.println("Addition: " + m.sum(10, 20));
        System.out.println("Subtraction: " + m.subt(20, 10));
        System.out.println("Multiplication: " + m.mult(20, 2));
        System.out.println("Division: " + m.div(50, 2));

        IMath2020 m1 = m;
        System.out.println("Using IMath2020: " + m1.sum(10, 200));

        IMath2022 m2 = m;
        System.out.println("Using IMath2022 addition: " + m2.sum(40, 50));
        System.out.println("Using IMath2022 subtraction: " + m2.subt(100, 40));

        IMath2025 m3 = m;
        System.out.println("Using IMath2025: " + m3.mult(20, 4));

        System.out.println("Division after casting: " +
            ((SimpleMath) m3).div(100, 50));
    }
}

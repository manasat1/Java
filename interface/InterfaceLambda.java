interface IMath1 {
    int sum(int x, int y);
}

class InterfaceLambda {
    public static void main(String[] args) {

        IMath1 m;

        m = (x, y) -> x + y;

        System.out.println(m.sum(10, 12));
    }
}

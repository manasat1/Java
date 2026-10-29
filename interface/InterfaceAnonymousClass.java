interface IMath {
    int sum(int x, int y);
}

class InterfaceAnonymousClass {

    public static void main(String[] args) {

        IMath m = new IMath() {

            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Sum: " + m.sum(100, 200));
    }
}

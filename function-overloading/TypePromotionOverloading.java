class TypePromotionOverloading {

    public static void main(String[] args) {

        TypePromotion t = new TypePromotion();

        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;

        t.display(b);
        t.display(s);
        t.display(i);
        t.display(l);
    }
}

class TypePromotion {

    public void display(int x) {
        System.out.println("Integer method: " + x);
    }

    public void display(long x) {
        System.out.println("Long method: " + x);
    }
}

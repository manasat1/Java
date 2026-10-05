class Math1 {

    private int data;

    public Math1(int val) {
        data = val;
    }

    public Math1 sum(Math1 m) {
        Math1 t;
        t = new Math1(data + m.data);
        return t;
    }

    public void print() {
        System.out.println(data);
    }
}

public class ObjectAsParameter {

    public static void main(String[] args) {

        Math1 m1, m2, m3;

        m1 = new Math1(100);
        m2 = new Math1(200);

        m3 = m1.sum(m2);

        m3.print();
    }
}

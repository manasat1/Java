class Parent {

    public void print() {
        System.out.println("From Parent Print()");
    }
}

class Child extends Parent {

    @Override
    public void print() {
        System.out.println("From Child Print()");
    }

    public void print(String str) {
        System.out.println("From Child Print() with parameter");
    }
}

public class UpcastingDowncasting {

    public static void main(String[] args) {

        Parent p;
        Child c;

        // Upcasting
        p = new Child();

        // Downcasting
        c = (Child) p;

        c.print("hello");
    }
}

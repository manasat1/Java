class Myclass {

    public Myclass() {
        System.out.println("Constructor Invoked");
    }
}

public class NoArgumentConstructor {

    public static void main(String[] args) {

        Myclass mc;
        mc = new Myclass();
    }
}

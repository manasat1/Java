interface Payment {

    void pay();
}

class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}

class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

public class Interface {

    public static void main(String[] args) {

        UPI u = new UPI();
        u.pay();

        CreditCard c = new CreditCard();
        c.pay();
    }
}

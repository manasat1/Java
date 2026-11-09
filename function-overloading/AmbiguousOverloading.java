class AmbiguousOverloading {

    public static void main(String[] args) {

        DisplayValue d = new DisplayValue();

        d.display(10);
        d.display(10.5);
        d.display("Ramu");
    }
}

class DisplayValue {

    public void display(int number) {
        System.out.println("Integer value: " + number);
    }

    public void display(double number) {
        System.out.println("Double value: " + number);
    }

    public void display(String text) {
        System.out.println("String value: " + text);
    }
}

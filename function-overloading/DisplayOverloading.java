class DisplayOverloading {

    public static void main(String[] args) {

        Display d = new Display();

        d.display(100);
        d.display(25.5f);
        d.display(45.678);
        d.display('M');
        d.display("Manasa");
    }
}

class Display {

    public void display(int x) {
        System.out.println("Integer value: " + x);
    }

    public void display(float x) {
        System.out.println("Float value: " + x);
    }

    public void display(double x) {
        System.out.println("Double value: " + x);
    }

    public void display(char x) {
        System.out.println("Character value: " + x);
    }

    public void display(String x) {
        System.out.println("String value: " + x);
    }
}

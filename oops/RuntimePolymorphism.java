import java.util.Scanner;

class Base {

    public void print() {
    }
}

class Product extends Base {

    private int pid;
    private String pname;
    private double price;

    public void read(Scanner sc) {

        System.out.print("Enter Product ID: ");
        pid = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Product Name: ");
        pname = sc.nextLine();

        System.out.print("Enter Product Price: ");
        price = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void print() {
        System.out.println("Product: " + pid + " " + pname + " " + price);
    }
}

class Employee extends Base {

    private int eid;
    private String ename;
    private double salary;

    public void read(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        eid = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        salary = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void print() {
        System.out.println("Employee: " + eid + " " + ename + " " + salary);
    }
}

class List {

    private Base[] x;
    private int i;

    public List() {
        x = new Base[10];
        i = 0;
    }

    public void add(Base b) {
        x[i] = b;
        i++;
    }

    public Base get() {
        return x[--i];
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List l = new List();

        Product p = new Product();
        Employee e = new Employee();

        p.read(sc);
        e.read(sc);

        l.add(p);
        l.add(e);

        for (int i = 0; i < 2; i++) {
            l.get().print();
        }

        sc.close();
    }
}

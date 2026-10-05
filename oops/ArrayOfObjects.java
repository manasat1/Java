import java.util.Scanner;

class Student {

    private int id;
    private String name;
    private double fee;

    public void read(Scanner sc) {

        id = sc.nextInt();
        sc.nextLine();

        name = sc.nextLine();

        fee = sc.nextDouble();
    }

    public void print() {

        System.out.printf("%d %s %.2f%n", id, name, fee);
    }
}

public class ArrayOfObjects {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[5];

        for (int i = 0; i < 5; i++) {

            s[i] = new Student();

            s[i].read(sc);
        }

        System.out.println("Student Details:");

        for (int i = 0; i < 5; i++) {

            s[i].print();
        }

        sc.close();
    }
}

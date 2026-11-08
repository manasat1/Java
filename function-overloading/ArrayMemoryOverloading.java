import java.util.Scanner;

class ArrayMemoryOverloading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayListCustom list = new ArrayListCustom();

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        // Calling memory() method
        list.memory();

        list.add(10);
        list.add(12);
        list.add(14);

        System.out.println("\nElements using default array size:");
        list.print();

        // Calling overloaded memory(int size) method
        list.memory(size);

        list.add(100);
        list.add(200);
        list.add(300);

        System.out.println("\nElements using user-defined array size:");
        list.print();

        sc.close();
    }
}

class ArrayListCustom {

    private int[] a;
    private int i;

    // Allocates default array size
    public void memory() {
        a = new int[10];
        i = 0;
        System.out.println("Default array size: 10");
    }

    // Allocates user-defined array size
    public void memory(int size) {
        a = new int[size];
        i = 0;
        System.out.println("User-defined array size: " + size);
    }

    // Adds elements to array
    public void add(int x) {
        if (i < a.length) {
            a[i] = x;
            i++;
        } else {
            System.out.println("Array is full!");
        }
    }

    // Displays array elements
    public void print() {
        for (int j = 0; j < i; j++) {
            System.out.println(a[j]);
        }
    }
}

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

class HashtablePhonebook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hashtable<Character, ArrayList<Phonebook>> ht = new Hashtable<>();

        System.out.print("Enter number of contacts: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for contact " + (i + 1) + ":");

            System.out.print("Enter Name: ");
            String name = sc.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Try again.");
                i--;
                continue;
            }

            System.out.print("Enter Phone Number: ");
            String phno = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            Phonebook p = new Phonebook(phno, name, address);

            char key = Character.toUpperCase(name.charAt(0));

            ht.computeIfAbsent(key, k -> new ArrayList<>()).add(p);
        }

        System.out.println("\n--- Phonebook Entries Grouped by First Letter ---");

        Enumeration<Character> keys = ht.keys();

        while (keys.hasMoreElements()) {

            char key = keys.nextElement();

            System.out.println("\nNames starting with '" + key + "':");

            for (Phonebook pb : ht.get(key)) {
                System.out.println("  " + pb);
            }
        }

        sc.close();
    }
}

class Phonebook {

    private String phno;
    private String name;
    private String address;

    public Phonebook(String phno, String name, String address) {
        this.phno = phno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " (" + phno + "), " + address;
    }
}

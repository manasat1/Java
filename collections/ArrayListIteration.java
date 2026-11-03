import java.util.ArrayList;
import java.util.Iterator;

class ArrayListIteration {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ram");
        names.add("Anjali");
        names.add("Raju");
        names.add("Sneha");

        // Using for loop
        System.out.println("Using for loop:");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Using enhanced for loop
        System.out.println("Using enhanced for loop:");

        for (String name : names) {
            System.out.println(name);
        }

        // Using Iterator
        System.out.println("Using Iterator:");

        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

import java.util.ArrayList;

class ArrayListCollections {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        // Adding elements
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        // Accessing elements
        System.out.println("Element at index 1: " + al.get(1));

        // Finding index
        System.out.println("Index of 30: " + al.indexOf(30));

        // Displaying elements
        System.out.println("Original ArrayList:");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // Adding element at a specific index
        al.add(2, 60);

        // Removing elements
        al.remove(0);
        al.remove(Integer.valueOf(40));

        // Displaying updated ArrayList
        System.out.println("Updated ArrayList:");

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}

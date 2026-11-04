import java.util.LinkedList;

class LinkedListMethods {

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Hyderabad");
        cities.add("Mumbai");
        cities.add("Chennai");

        System.out.println("Original List: " + cities);

        cities.addFirst("Delhi");
        cities.addLast("Bengaluru");

        System.out.println("After adding first and last: " + cities);

        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());

        cities.removeFirst();
        cities.removeLast();

        System.out.println("After removing first and last: " + cities);

        System.out.println("Contains Mumbai: " + cities.contains("Mumbai"));

        System.out.println("Size: " + cities.size());
    }
}

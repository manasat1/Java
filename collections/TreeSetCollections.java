import java.util.TreeSet;

class TreeSetCollections {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("TreeSet: " + numbers);

        System.out.println("First element: " + numbers.first());

        System.out.println("Last element: " + numbers.last());

        System.out.println("Contains 30: " + numbers.contains(30));

        numbers.remove(40);

        System.out.println("After removing 40: " + numbers);

        System.out.println("Size: " + numbers.size());
    }
}

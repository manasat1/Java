import java.util.LinkedHashSet;

class LinkedHashSetCollections {

    public static void main(String[] args) {

        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("LinkedHashSet: " + fruits);

        System.out.println("Contains Mango: "
                + fruits.contains("Mango"));

        fruits.remove("Banana");

        System.out.println("After removing Banana: " + fruits);

        System.out.println("Size: " + fruits.size());
    }
}

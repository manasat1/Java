import java.util.HashSet;

class HashSetCollections {

    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("HashSet: " + fruits);

        System.out.println("Contains Mango: "
                + fruits.contains("Mango"));

        fruits.remove("Banana");

        System.out.println("After removing Banana: " + fruits);

        System.out.println("Size: " + fruits.size());
    }
}

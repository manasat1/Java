import java.util.ArrayList;

class ArrayListDuplicateElements {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("ArrayList: " + fruits);

        // Finding duplicate elements
        System.out.println("Duplicate Elements:");

        for (int i = 0; i < fruits.size(); i++) {

            for (int j = i + 1; j < fruits.size(); j++) {

                if (fruits.get(i).equals(fruits.get(j))) {
                    System.out.println(fruits.get(i));
                    break;
                }
            }
        }
    }
}

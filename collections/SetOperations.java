import java.util.HashSet;
import java.util.Set;

class SetOperations {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Union: " + union);

        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Intersection: " + intersection);

        // Difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("Difference: " + difference);
    }
}

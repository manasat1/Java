public class CountSubstring {

    public static void main(String[] args) {

        String s = "java is easy and java is powerful";
        String target = "java";

        String[] parts = s.split(target, -1);

        int count = parts.length - 1;

        System.out.println("Original String: " + s);
        System.out.println("Substring: " + target);
        System.out.println("Occurrences: " + count);
    }
}

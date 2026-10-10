import java.util.Arrays;

public class SortCharacters {

    public static void main(String[] args) {

        String s = "java";

        char[] c = s.toCharArray();

        Arrays.sort(c);

        String result = new String(c);

        System.out.println("Original String: " + s);
        System.out.println("Sorted String: " + result);
    }
}

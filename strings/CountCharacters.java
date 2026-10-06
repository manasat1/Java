public class CountCharacters {

    public static void main(String[] args) {

        String s = "Java";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
        }

        System.out.println("String: " + s);
        System.out.println("Number of characters: " + count);
    }
}

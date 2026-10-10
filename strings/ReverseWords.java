public class ReverseWords {

    public static void main(String[] args) {

        String s = "Java is easy to learn";

        String[] words = s.split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {

            result = result + words[i] + " ";
        }

        result = result.trim();

        System.out.println("Original String: " + s);
        System.out.println("Reversed Words: " + result);
    }
}

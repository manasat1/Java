public class StringBuilderReverse {

    public static void main(String[] args) {

        String s = "Java";

        StringBuilder sb = new StringBuilder(s);

        String reverse = sb.reverse().toString();

        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + reverse);
    }
}

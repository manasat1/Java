public class StringReverse {

    public static void main(String[] args) {

        String s = "Java";
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + reverse);
    }
}

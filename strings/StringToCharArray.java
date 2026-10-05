public class StringToCharArray {

    public static void main(String[] args) {

        String s = "Java";

        char[] c = s.toCharArray();

        System.out.println("String: " + s);

        System.out.println("Characters:");

        for (char ch : c) {
            System.out.println(ch);
        }
    }
}

public class StringMethods {

    public static void main(String[] args) {

        String s = "Java Programming";

        System.out.println("Length: " + s.length());
        System.out.println("Character at index 2: " + s.charAt(2));
        System.out.println("Substring: " + s.substring(5));
        System.out.println("Contains Java: " + s.contains("Java"));
        System.out.println("Starts with Java: " + s.startsWith("Java"));
        System.out.println("Ends with ing: " + s.endsWith("ing"));
    }
}

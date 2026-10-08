public class StringEqualsIgnoreCase {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "JAVA";

        System.out.println("Using equals(): " + s1.equals(s2));
        System.out.println("Using equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));
    }
}

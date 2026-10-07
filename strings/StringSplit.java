public class StringSplit {

    public static void main(String[] args) {

        String s = "Java,Spring,SQL,Angular";

        String[] values = s.split(",");

        System.out.println("Original String: " + s);

        System.out.println("Values:");

        for (String value : values) {
            System.out.println(value);
        }
    }
}

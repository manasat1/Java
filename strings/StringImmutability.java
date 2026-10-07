public class StringImmutability {

    public static void main(String[] args) {

        String s = "Java";

        System.out.println("Before change: " + s);

        s.concat(" Programming");

        System.out.println("After concat without assignment: " + s);

        s = s.concat(" Programming");

        System.out.println("After concat with assignment: " + s);
    }
}

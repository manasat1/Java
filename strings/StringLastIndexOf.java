public class StringLastIndexOf {

    public static void main(String[] args) {

        String s = "Java Programming";

        System.out.println("First index of a: " + s.indexOf('a'));
        System.out.println("Last index of a: " + s.lastIndexOf('a'));
        System.out.println("Last index of Programming: " + s.lastIndexOf("Programming"));
    }
}

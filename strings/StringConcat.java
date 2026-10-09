public class StringConcat {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Java";

        String result = s1.concat(" ").concat(s2);

        System.out.println("First String: " + s1);
        System.out.println("Second String: " + s2);
        System.out.println("Concatenated String: " + result);
    }
}

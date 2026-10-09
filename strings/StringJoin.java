public class StringJoin {

    public static void main(String[] args) {

        String s = String.join("-", "Java", "Spring", "SQL");

        System.out.println("Joined String: " + s);

        String result = String.join(" | ", "HTML", "CSS", "JavaScript");

        System.out.println("Technologies: " + result);
    }
}

public class StringInterviewPractice {

    public static void main(String[] args) {

        String s1 = "12345";
        String s2 = "Java123";

        System.out.println(s1 + " contains only digits: "
                + containsOnlyDigits(s1));

        System.out.println(s2 + " contains only digits: "
                + containsOnlyDigits(s2));
    }

    static boolean containsOnlyDigits(String s) {

        if (s.isEmpty()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}

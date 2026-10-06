public class FindDuplicateCharacters {

    public static void main(String[] args) {

        String s = "programming";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (s.charAt(j) == c) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                continue;
            }

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(j) == c) {
                    System.out.println(c);
                    break;
                }
            }
        }
    }
}

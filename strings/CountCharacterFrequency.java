public class CountCharacterFrequency {

    public static void main(String[] args) {

        String s = "java";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == c) {
                    count++;
                }
            }

            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {

                if (s.charAt(j) == c) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                System.out.println(c + " = " + count);
            }
        }
    }
}

public class FindFirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String s = "swiss";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == c) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeated character: " + c);
                break;
            }
        }
    }
}

public class CountSpecificCharacter {

    public static void main(String[] args) {

        String s = "programming";
        char target = 'g';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("String: " + s);
        System.out.println("Character: " + target);
        System.out.println("Occurrences: " + count);
    }
}

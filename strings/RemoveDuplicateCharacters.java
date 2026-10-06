public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        String s = "programming";
        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (result.indexOf(c) == -1) {
                result = result + c;
            }
        }

        System.out.println("Original String: " + s);
        System.out.println("Without duplicate characters: " + result);
    }
}

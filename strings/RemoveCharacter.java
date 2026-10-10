public class RemoveCharacter {

    public static void main(String[] args) {

        String s = "programming";
        char target = 'm';

        String result = s.replace(
            String.valueOf(target), ""
        );

        System.out.println("Original String: " + s);
        System.out.println("After removing '" + target + "': " + result);
    }
}

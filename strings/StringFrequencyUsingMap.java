import java.util.HashMap;
import java.util.Map;

public class StringFrequencyUsingMap {

    public static void main(String[] args) {

        String s = "banana";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("String: " + s);
        System.out.println("Character frequencies: " + map);
    }
}

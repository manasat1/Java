public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] numbers = {100, 4, 200, 1, 3, 2};

        int longest = 0;

        for (int i = 0; i < numbers.length; i++) {

            int current = numbers[i];
            int count = 1;

            while (contains(numbers, current + 1)) {
                current++;
                count++;
            }

            if (count > longest) {
                longest = count;
            }
        }

        System.out.println("Longest consecutive sequence length: " + longest);
    }

    static boolean contains(int[] numbers, int value) {

        for (int n : numbers) {
            if (n == value) {
                return true;
            }
        }

        return false;
    }
}

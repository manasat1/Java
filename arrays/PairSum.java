public class PairSum {

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    System.out.println(
                        "Pair: " + numbers[i] + " and " + numbers[j]
                    );
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Pair not found");
        }
    }
}

public class ArrayLeaders {

    public static void main(String[] args) {

        int[] numbers = {16, 17, 4, 3, 5, 2};

        System.out.println("Leaders in the array:");

        for (int i = 0; i < numbers.length; i++) {

            boolean leader = true;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] < numbers[j]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

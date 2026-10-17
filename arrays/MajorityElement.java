public class MajorityElement {

    public static void main(String[] args) {

        int[] numbers = {2, 2, 1, 2, 3, 2, 2};

        int majority = -1;

        for (int i = 0; i < numbers.length; i++) {

            int count = 0;

            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count > numbers.length / 2) {
                majority = numbers[i];
                break;
            }
        }

        if (majority != -1) {
            System.out.println("Majority element: " + majority);
        } else {
            System.out.println("No majority element found");
        }
    }
}

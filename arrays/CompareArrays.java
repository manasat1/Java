import java.util.Arrays;

public class CompareArrays {

    public static void main(String[] args) {

        int[] a = {10, 20, 30};
        int[] b = {10, 20, 30};
        int[] c = {10, 30, 20};

        System.out.println("a and b are equal: " + Arrays.equals(a, b));
        System.out.println("a and c are equal: " + Arrays.equals(a, c));
    }
}

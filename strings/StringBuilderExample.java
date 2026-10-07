public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");

        System.out.println("After append: " + sb);

        sb.insert(5, "Language ");

        System.out.println("After insert: " + sb);

        sb.reverse();

        System.out.println("After reverse: " + sb);
    }
}

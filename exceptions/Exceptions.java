import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Exceptions {

    public static void main(String[] args) {

        try {
            FileInputStream fis =
                new FileInputStream("d:\\kk.txt");

            System.out.println("File opened successfully.");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

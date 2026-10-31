import java.io.FileReader;
import java.io.IOException;

class TryWithResources {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader("data.txt")) {

            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        System.out.println("\nProgram completed");
    }
}

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer = new FileWriter("sample.txt", true);

            writer.write("\nLearning Java File Handling");

            writer.close();

            System.out.println("Data appended successfully");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

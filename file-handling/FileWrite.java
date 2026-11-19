import java.io.FileWriter;
import java.io.IOException;

public class FileWrite
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Welcome to Java File Handling");

            writer.close();

            System.out.println("Data written successfully");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

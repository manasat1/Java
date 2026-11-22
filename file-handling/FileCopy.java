import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy
{
    public static void main(String[] args)
    {
        try
        {
            FileReader reader = new FileReader("sample.txt");
            FileWriter writer = new FileWriter("copy.txt");

            int ch;

            while ((ch = reader.read()) != -1)
            {
                writer.write(ch);
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

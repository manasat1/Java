import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample
{
    public static void main(String[] args)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("sample.txt"));

            writer.write("Java File Handling");
            writer.newLine();
            writer.write("Learning BufferedWriter");

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

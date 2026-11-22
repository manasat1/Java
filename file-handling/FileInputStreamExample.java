import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis =
                    new FileInputStream("sample.txt");

            int data;

            while ((data = fis.read()) != -1)
            {
                System.out.print((char) data);
            }

            fis.close();

            System.out.println("\nFile reading completed");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

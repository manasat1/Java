import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fos =
                    new FileOutputStream("output.txt");

            String data = "Learning Java FileOutputStream";

            fos.write(data.getBytes());

            fos.close();

            System.out.println("Data written successfully");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

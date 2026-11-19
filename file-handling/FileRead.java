import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileRead
{
    public static void main(String[] args)
    {
        try
        {
            FileReader reader = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

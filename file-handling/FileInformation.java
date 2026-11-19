import java.io.File;

public class FileInformation
{
    public static void main(String[] args)
    {
        File file = new File("sample.txt");

        if (file.exists())
        {
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Can Read: " + file.canRead());
            System.out.println("Can Write: " + file.canWrite());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Is Directory: " + file.isDirectory());
        }
        else
        {
            System.out.println("File does not exist");
        }
    }
}

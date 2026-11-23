import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class DeserializationExample
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis =
                    new FileInputStream("student.ser");

            ObjectInputStream ois =
                    new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            System.out.println("Student ID: " + s.id);
            System.out.println("Student Name: " + s.name);
            System.out.println("Student Fee: " + s.fee);

            ois.close();
            fis.close();

            System.out.println("Object deserialized successfully");
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

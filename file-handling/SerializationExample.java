import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

class Student implements Serializable
{
    int id;
    String name;
    double fee;

    Student(int id, String name, double fee)
    {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }
}

public class SerializationExample
{
    public static void main(String[] args)
    {
        try
        {
            Student s = new Student(101, "Ravi", 25000.0);

            FileOutputStream fos =
                    new FileOutputStream("student.ser");

            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            oos.writeObject(s);

            oos.close();
            fos.close();

            System.out.println("Object serialized successfully");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

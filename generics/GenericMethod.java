class Display
{
    public <T> void printValue(T value)
    {
        System.out.println("Value: " + value);
    }
}

public class GenericMethod
{
    public static void main(String[] args)
    {
        Display obj = new Display();

        obj.printValue(100);
        obj.printValue("Java");
        obj.printValue(25.5);
        obj.printValue(true);
    }
}

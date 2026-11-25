class Display
{
    public <T, U> void printValues(T value1, U value2)
    {
        System.out.println("First Value: " + value1);
        System.out.println("Second Value: " + value2);
    }
}

public class GenericMethodMultipleTypes
{
    public static void main(String[] args)
    {
        Display obj = new Display();

        obj.printValues(100, "Java");
        obj.printValues("Price", 250.50);
        obj.printValues(true, 'A');
    }
}

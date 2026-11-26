import java.util.*;

class Display
{
    public void addNumbers(List<? super Integer> list)
    {
        list.add(10);
        list.add(20);
        list.add(30);

        for(Object value : list)
        {
            System.out.println(value);
        }
    }
}

public class GenericLowerBoundWildcard
{
    public static void main(String[] args)
    {
        Display obj = new Display();

        List<Integer> integers = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        System.out.println("Integer List:");
        obj.addNumbers(integers);

        System.out.println("\nNumber List:");
        obj.addNumbers(numbers);

        System.out.println("\nObject List:");
        obj.addNumbers(objects);
    }
}

import java.util.*;

class Display
{
    public void printList(List<?> list)
    {
        for(Object value : list)
        {
            System.out.println(value);
        }
    }
}

public class GenericWildcards
{
    public static void main(String[] args)
    {
        Display obj = new Display();

        List<Integer> numbers = Arrays.asList(10, 20, 30);
        List<String> names = Arrays.asList("Java", "Python", "C");

        System.out.println("Integer List:");
        obj.printList(numbers);

        System.out.println("\nString List:");
        obj.printList(names);
    }
}

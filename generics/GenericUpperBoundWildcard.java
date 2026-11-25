import java.util.*;

class Display
{
    public void printNumbers(List<? extends Number> list)
    {
        for(Number value : list)
        {
            System.out.println(value);
        }
    }
}

public class GenericUpperBoundWildcard
{
    public static void main(String[] args)
    {
        Display obj = new Display();

        List<Integer> integers = Arrays.asList(10, 20, 30);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);
        List<Float> floats = Arrays.asList(5.5f, 6.5f);

        System.out.println("Integer List:");
        obj.printNumbers(integers);

        System.out.println("\nDouble List:");
        obj.printNumbers(doubles);

        System.out.println("\nFloat List:");
        obj.printNumbers(floats);
    }
}

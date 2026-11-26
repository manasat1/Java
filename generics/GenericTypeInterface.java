interface Container<T>
{
    void setValue(T value);
    T getValue();
}

class Data<T> implements Container<T>
{
    private T value;

    public void setValue(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }
}

public class GenericTypeInterface
{
    public static void main(String[] args)
    {
        Data<Integer> d1 = new Data<>();
        d1.setValue(100);

        Data<String> d2 = new Data<>();
        d2.setValue("Java");

        Data<Double> d3 = new Data<>();
        d3.setValue(25.5);

        System.out.println("Integer Value: " + d1.getValue());
        System.out.println("String Value: " + d2.getValue());
        System.out.println("Double Value: " + d3.getValue());
    }
}

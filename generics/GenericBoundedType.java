class NumberBox<T extends Number>
{
    T value;

    NumberBox(T value)
    {
        this.value = value;
    }

    void display()
    {
        System.out.println("Value: " + value);
        System.out.println("Double Value: " + value.doubleValue());
    }
}

public class GenericBoundedType
{
    public static void main(String[] args)
    {
        NumberBox<Integer> b1 = new NumberBox<>(100);
        NumberBox<Double> b2 = new NumberBox<>(25.5);
        NumberBox<Float> b3 = new NumberBox<>(10.5f);

        b1.display();
        b2.display();
        b3.display();
    }
}

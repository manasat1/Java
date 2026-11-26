class Parent<T>
{
    T value;

    Parent(T value)
    {
        this.value = value;
    }

    void display()
    {
        System.out.println("Parent Value: " + value);
    }
}

class Child<T> extends Parent<T>
{
    Child(T value)
    {
        super(value);
    }

    void show()
    {
        System.out.println("Child Value: " + value);
    }
}

public class GenericTypeInheritance
{
    public static void main(String[] args)
    {
        Child<Integer> c1 = new Child<>(100);
        Child<String> c2 = new Child<>("Java");
        Child<Double> c3 = new Child<>(25.5);

        c1.display();
        c1.show();

        c2.display();
        c2.show();

        c3.display();
        c3.show();
    }
}

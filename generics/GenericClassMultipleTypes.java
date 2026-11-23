class Pair<T, U>
{
    T first;
    U second;

    Pair(T first, U second)
    {
        this.first = first;
        this.second = second;
    }

    void display()
    {
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}

public class GenericClassMultipleTypes
{
    public static void main(String[] args)
    {
        Pair<Integer, String> p1 =
                new Pair<>(101, "Java");

        Pair<String, Double> p2 =
                new Pair<>("Price", 250.50);

        Pair<String, String> p3 =
                new Pair<>("Language", "Java");

        p1.display();
        p2.display();
        p3.display();
    }
}

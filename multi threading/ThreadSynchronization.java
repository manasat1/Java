class Table
{
    synchronized void printTable(int n)
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(n + " x " + i + " = " + (n * i));

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadSynchronization
{
    public static void main(String[] args)
    {
        Table obj = new Table();

        Thread t1 = new Thread(() ->
        {
            obj.printTable(5);
        });

        Thread t2 = new Thread(() ->
        {
            obj.printTable(10);
        });

        t1.start();
        t2.start();
    }
}

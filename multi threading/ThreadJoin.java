class MyThread extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class ThreadJoin
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();

        t.start();

        try
        {
            t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("Main Thread completed");
    }
}

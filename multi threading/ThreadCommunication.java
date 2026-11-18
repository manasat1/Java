class Shared
{
    synchronized void printMessage()
    {
        try
        {
            System.out.println("Thread is waiting...");

            wait();

            System.out.println("Thread resumed after notification");
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }

    synchronized void sendNotification()
    {
        System.out.println("Sending notification...");

        notify();
    }
}

public class ThreadCommunication
{
    public static void main(String[] args)
    {
        Shared obj = new Shared();

        Thread t1 = new Thread(() ->
        {
            obj.printMessage();
        });

        Thread t2 = new Thread(() ->
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }

            obj.sendNotification();
        });

        t1.start();
        t2.start();
    }
}

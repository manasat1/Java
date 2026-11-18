public class ThreadDeadlock
{
    public static void main(String[] args)
    {
        final String resource1 = "Resource 1";
        final String resource2 = "Resource 2";

        Thread t1 = new Thread(() ->
        {
            synchronized (resource1)
            {
                System.out.println("Thread 1 locked Resource 1");

                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    System.out.println(e);
                }

                synchronized (resource2)
                {
                    System.out.println("Thread 1 locked Resource 2");
                }
            }
        });

        Thread t2 = new Thread(() ->
        {
            synchronized (resource2)
            {
                System.out.println("Thread 2 locked Resource 2");

                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    System.out.println(e);
                }

                synchronized (resource1)
                {
                    System.out.println("Thread 2 locked Resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

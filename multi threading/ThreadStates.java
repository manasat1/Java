public class ThreadStates
{
    public static void main(String[] args)
    {
        Thread t = new Thread(() ->
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        });

        System.out.println("Before start: " + t.getState());

        t.start();

        System.out.println("After start: " + t.getState());

        try
        {
            t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("After completion: " + t.getState());
    }
}

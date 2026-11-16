public class ThreadUsingLambda
{
    public static void main(String[] args)
    {
        Runnable r = () ->
        {
            System.out.println("Thread is running using Lambda Expression");
        };

        Thread t = new Thread(r);
        t.start();
    }
}

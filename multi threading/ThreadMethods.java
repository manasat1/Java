public class ThreadMethods
{
    public static void main(String[] args)
    {
        Thread t = new Thread(() ->
        {
            System.out.println("Thread is running");

            System.out.println("Thread Name: " +
                    Thread.currentThread().getName());

            System.out.println("Thread Priority: " +
                    Thread.currentThread().getPriority());
        });

        t.setName("MyThread");
        t.setPriority(7);

        t.start();

        System.out.println("Main Thread: " +
                Thread.currentThread().getName());

        System.out.println("Is thread alive: " + t.isAlive());
    }
}

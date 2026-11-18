import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample
{
    public static void main(String[] args)
    {
        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++)
        {
            final int task = i;

            executor.execute(() ->
            {
                System.out.println(
                    "Task " + task + " executed by " +
                    Thread.currentThread().getName()
                );
            });
        }

        executor.shutdown();
    }
}

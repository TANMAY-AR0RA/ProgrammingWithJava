import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorServiceRunner2{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));

        executorService.shutdown();
    }
}

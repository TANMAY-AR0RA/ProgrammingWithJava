import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner1{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(new Task1thread());
        executorService.execute(new Thread(new Task2thread()));

        executorService.shutdown();
    }
}

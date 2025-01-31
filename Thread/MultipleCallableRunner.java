import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //ExecutorService executorService = Executors.newFixedThreadPool(1); //slow
        ExecutorService executorService = Executors.newFixedThreadPool(3); //fast

        List<CallableTask> tasks = List.of(new CallableTask("Tanmay"), new CallableTask("Josh"), new CallableTask("Aman"));

        List<Future<String>> results = executorService.invokeAll(tasks);

        for (Future<String> result : results){
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3); //fast

        List<CallableTask> tasks = List.of(
                new CallableTask("Tanmay"),
                new CallableTask("Josh"),
                new CallableTask("Aman"));

        String result = executorService.invokeAny(tasks);
        //using invokeAny Pass multiple lists of task, as soon as any of the tasks executes it gives it as a result

        System.out.println(result);
        // Different result each time because of invoke any method

        executorService.shutdown();
    }
}

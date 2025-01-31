import java.util.concurrent.*;

class CallableTask implements Callable<String>{
    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "This is " + name;
    }
}
public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("new Callable Task using Callable Interface"));

        System.out.println("\n new CallableTask(\"new Callable Task using Callable Interface\") executed");

        String result = welcomeFuture.get(); //get method can be called on a Future.
        // Future is not a result it's a promise that there will be a result.
        // Once a get method is called on future , it waits for the task to complete execution.
        System.out.println(result);

        System.out.println("Main Completed");

        executorService.shutdown();
    }
}

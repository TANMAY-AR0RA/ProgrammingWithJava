class Task1thread extends Thread{
    @Override
    public void run() {
        System.out.println("Task 1 Started");
        for (int i = 101; i < 199; i++) {
            System.out.print(" " + i);
            Task1thread.yield();
        }
        System.out.println("\nTask 1 Completed");
    }
}

class Task2thread implements Runnable{
    @Override
    public void run() {
        System.out.println("Task 2 Started");
        for (int i = 201; i < 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 2 Completed");
    }
}
public class ThreadRunner {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Task 1 about to start");
        Task1thread task1 = new Task1thread();
        task1.start();

        System.out.println("Task 2 about to start");
        Task2thread task2 = new Task2thread();
        Thread t2thread = new Thread(task2);
        t2thread.start();

        task1.join();

        System.out.println("Task 3 about to start");
        System.out.println("Task 3 Started");
        for (int i = 301; i < 399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Task 3 Completed");
    }
}

public class Task extends Thread{
    private final int num;
    public Task(int num){
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println("Task " + num + " Started");

        for (int i = num*100; i < num*100 +99; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n Task " + num + " Done!");
    }
}
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new PotatoPeelingTask(3));
        tasks.add(new PotatoPeelingTask(4));

        tasks.add(new CoffeeMakingTask(3));
        tasks.add(new CoffeeMakingTask(4));

        tasks.add(new PotatoPeelingTask(6));
        tasks.add(new PotatoPeelingTask(2));

        tasks.add(new CoffeeMakingTask(6));
        tasks.add(new CoffeeMakingTask(2));

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (Task i : tasks) {
            executorService.execute(new Worker(i));
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            Thread.yield();
        }
        System.out.println("Program Finished");
    }
}

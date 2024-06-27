
public class DemoRun {
    public static void main(String[] args) {
        MyRunnable commonInstance = new MyRunnable();
        Thread t1 = new Thread(commonInstance,"t1");
        Thread t2 = new Thread(commonInstance,"t2");
        Thread t3 = new Thread(commonInstance,"t3");
        Thread t4 = new Thread(commonInstance,"t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // wait for threads to end
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
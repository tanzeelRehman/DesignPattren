package reentrantLock;

public class DemoReEntrant {

    public static void main(String[] args) {
        Printer printer = new Printer();

        MyThread t1 = new MyThread("Person A", printer);
        MyThread t2 = new MyThread("Person B", printer);
        t2.start();
        t1.start();


    }

}
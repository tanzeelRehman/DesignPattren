import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cook extends Thread {
    private static final int shelf_size = 3;
    private final List<Integer> shelf = new ArrayList<>();
    Random time_in_sec = new Random();

    @Override
    public void run() {
        try {
            int i = 0;
            do {
                cook();
                i++;
            } while (i <= 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private synchronized void cook() throws InterruptedException {
        while (shelf.size() == shelf_size) {
            System.out.println("Wait:- Shelf is full");
            wait();
        }
        int orderNo = time_in_sec.nextInt(100);
        int cookingTime = time_in_sec.nextInt(10);
        shelf.add(orderNo);
        System.out.println("Order No " +" ' "+ orderNo +" ' "+ " Added to Shelf");
        System.out.println("Cook: Time taken to prepare order no. " + orderNo + " =" + cookingTime + " seconds");

        notify();
    }

    public synchronized int consume() throws InterruptedException {
        notify();
        while (shelf.isEmpty()) {
            wait();
        }
        int orderNo = shelf.get(0);
        shelf.remove((Integer) orderNo);
        System.out.println("Order No " +" ' "+ orderNo +" ' "+ " Removed from Shelf");
        return orderNo;
    }

    public synchronized int unServedOrders() {
        return shelf.size();
    }
}
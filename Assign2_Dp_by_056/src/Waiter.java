public class Waiter extends Thread {
	private Cook cook;
	private String thread;
	public Waiter(Cook cook,String thread) {
		this.cook=cook;
		this.thread = thread;
	}
	@Override
	public void run() {
		try {
			int i =0;
			do {
				int orderNo = cook.consume();
				int orderPending = cook.unServedOrders();
				System.out.println(thread + ": serving order no. " + orderNo + ". There are " + orderPending + " Un-served orders on the shelf");
				Thread.sleep(1000);
				i++;
			} while (i<=6);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

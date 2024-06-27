public class DemoShelf {

	public static void main(String[] args) {
		Cook cook=new Cook();
		cook.start();
		Waiter waiter1=new Waiter(cook,"Waiter1");
		waiter1.start();
		Waiter waiter2=new Waiter(cook,"Waiter2");
		waiter2.start();
	}

}

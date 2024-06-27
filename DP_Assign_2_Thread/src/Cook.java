public class Cook extends Thread {
    Pizza pizza;
    CookListener cookListener;

    public Cook(Pizza pizza, CookListener cookListener) {
        super();
        this.pizza = pizza;
        this.cookListener = cookListener;
    }
    public void run() {
        try {
            Thread.sleep((long) (pizza.getCookingTime()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cookListener.pizzaCooked(pizza);
    }
}

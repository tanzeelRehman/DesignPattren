public class Demo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("Pizza", 455);
        Item item1 = new Item("Burger", 500);
        cart.addItem(item);
        cart.addItem(item1);

        cart.setPaymentMethod(new PayPalStrategy("ahzam@gmail.com", "123455"));
        cart.checkout();
        cart.setPaymentMethod(new CreditCardStrategy("ahzam", "123455", "1234", "12/4/2023"));
        cart.checkout();


    }
}

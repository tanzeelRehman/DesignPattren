public class Demo {
    public static void main(String[] args) {
        Book book = new Book("Code complete", 120);
        CD cd = new CD("Design patterns in java: a practical tutorial", 100);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(book);
        shoppingCart.addItem(cd);
        System.out.println(shoppingCart);

        double payable = shoppingCart.calculatePayable();
        System.out.println("Total amount payable = " + payable);
    }
}

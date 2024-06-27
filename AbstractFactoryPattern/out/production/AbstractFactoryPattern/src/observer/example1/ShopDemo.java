package observer.example1;

public class ShopDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("Ahzam");
        Customer customer1 = new Customer("Zeeshan");
        GarmentShop garmentShop = new GarmentShop(Items.White_Shirt.name());

        //Subscribing to shop
        garmentShop.subscribe(customer);
        garmentShop.subscribe(customer1);
        // sending notifications
        garmentShop.setInStock(true);
        // changing item
        garmentShop.setItem(Items.Denim_Jacket.name());

        // unsubscribing
        garmentShop.unSubscribe(customer);

        System.out.println("Currently "+garmentShop.getItem()+" is in stock");
        System.out.println("Current subscribers are "+garmentShop.countObservers());

        // changing item
        garmentShop.setItem(Items.Black_Shirt.name());

    }
}

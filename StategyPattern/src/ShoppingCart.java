import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList = new ArrayList<>();
    private PaymentStrategy paymentMethod;

    public void addItem(Item item)  {
        itemList.add(item) ;
    }
    private int calculateAmount(){
        int amount=0;
        for (Item item : itemList){
            amount+=item.getPrice();
        }
        return amount;
    }

    public void setPaymentMethod(PaymentStrategy paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(){
        int amount= calculateAmount();
        paymentMethod.pay(amount);
    }

}

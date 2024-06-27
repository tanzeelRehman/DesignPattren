package observer.example1;

import java.util.Observable;

public class GarmentShop extends Observable {
    boolean inStock;
    String item="initial";

    public GarmentShop(String item) {
        this.item = item;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setItem(String item) {
        this.item = item;
        if (inStock){
            notifyPersons();
        }
    }

    public String getItem() {
        return item;
    }

    public void setInStock(boolean inStock) {

        this.inStock = inStock;
        if (inStock){
            notifyPersons();
        }
    }



    public void subscribe(Customer customer) {
     this.addObserver(customer);
    }


    public void unSubscribe(Customer customer) {
        this.deleteObserver(customer);
    }


    private void notifyPersons() {
        setChanged();
        this.notifyObservers(getItem());
    }

    @Override
    public String toString() {
        return "Garment Shop";
    }
}

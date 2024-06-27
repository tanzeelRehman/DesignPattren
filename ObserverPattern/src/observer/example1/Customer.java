package observer.example1;

import java.util.Observable;
import java.util.Observer;


public class Customer implements Observer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {
        String output = "Hey " + name + " item '" + arg + "\' is in Stock now";
        PrintBox.printBox(output);

    }

}

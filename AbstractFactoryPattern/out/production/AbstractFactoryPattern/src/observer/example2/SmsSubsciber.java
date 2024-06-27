package observer.example2;

import observer.example1.PrintBox;

import java.util.Observable;
import java.util.Observer;

public class SmsSubsciber implements Observer {
    String userInfo;

    public SmsSubsciber(String userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public void update(Observable o, Object arg) {


        String output = "Hello " + userInfo +" : "+ arg;
        PrintBox.printBox(output);
    }

    @Override
    public String toString() {
        return "SmsSubsciber{" +
                "userInfo='" + userInfo + '\'' +
                '}';
    }
}

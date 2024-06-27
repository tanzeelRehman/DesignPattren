package observer.example2;

import observer.example1.Customer;

import java.util.Observable;

public class Commentary extends Observable {
    String desc;


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
        if (desc != null) {
            this.notifySubs();
        }
    }
    public void subscribe(SmsSubsciber smsSubsciber) {
        this.addObserver(smsSubsciber);
    }


    public void unSubscribe(SmsSubsciber smsSubsciber) {
        this.deleteObserver(smsSubsciber);
    }


    private void notifySubs() {
        setChanged();
        this.notifyObservers(getDesc());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error Occurred.");
        }
    }

}

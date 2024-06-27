package mediator;

public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String msg) {
        super(mediator,msg);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.getName() + " ::>>>>>> Sending Message <<<<<<<<<<<: " + msg);
        getMediator().sendMessage(msg, this);
    }


    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " :---------: Received Message :---------- " + msg);
    }
}

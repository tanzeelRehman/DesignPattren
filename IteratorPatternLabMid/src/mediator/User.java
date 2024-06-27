package mediator;

public abstract class User {

    private ChatMediator mediator;
    private String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String msg);
    abstract void receive(String msg);

    public String getName() {
        return name;
    }

    public ChatMediator getMediator() {
        return mediator;
    }

}

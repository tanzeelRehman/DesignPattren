package src.com.mediator.roomMate;

public class TarkaGroupRoom implements RoomMate {
    private String name;

    public TarkaGroupRoom(String name) {
        this.name = name;
    }

    @Override
    public void receiveMessage(RoomMate roomMate, String msg) {
        System.out.println("[ " + this.name + " ] " + roomMate + ": " + msg);
    }

    @Override
    public String toString() {
        return name;
    }
}

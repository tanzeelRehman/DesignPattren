package src.com.mediator.chatroom;

import src.com.mediator.roomMate.RoomMate;

public interface ChatRoom {
    void accomodate(RoomMate roomMate);

    void fairwell(RoomMate roomMate);

    void sendMessage(RoomMate roomMate, String msg);

    boolean hasRoomMate(RoomMate roomMate);

    void printRoomMates();


}

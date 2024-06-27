package src.com.mediator;

import src.com.mediator.chatroom.ChatRoom;
import src.com.mediator.chatroom.OnlineChatRoom;
import src.com.mediator.roomMate.RoomMate;
import src.com.mediator.roomMate.TarkaGroupRoom;

public class ChatRoomDemo {
    public static void main(String[] args) {
        // create party and members
        ChatRoom chatRoom = new OnlineChatRoom();
        RoomMate mate = new TarkaGroupRoom("Saif");
        chatRoom.printRoomMates();
        chatRoom.sendMessage(mate, "Hello");
        chatRoom.accomodate(mate);
        chatRoom.sendMessage(mate,"hello to Everyone");
        chatRoom.printRoomMates();
        RoomMate mate1 = new TarkaGroupRoom("Zeeshan");
        RoomMate mate2 = new TarkaGroupRoom("Raffay");
        RoomMate mate3 = new TarkaGroupRoom("Zain");

        chatRoom.accomodate(mate1);
        chatRoom.accomodate(mate2);
        chatRoom.accomodate(mate3);
        System.out.println("----------------------------");
        chatRoom.sendMessage(mate," Lab 6 main kia kar rahe the tum sab .");
        chatRoom.fairwell(mate3);
        chatRoom.printRoomMates();
        chatRoom.fairwell(mate3);
    }
}

package src.com.mediator.chatroom;

import src.com.mediator.roomMate.RoomMate;

import java.util.ArrayList;
import java.util.List;

public class OnlineChatRoom implements ChatRoom {
    private List<RoomMate> roomMates = new ArrayList<>();

    // to join a chat room
    @Override
    public void accomodate(RoomMate mate) {
        if (roomMates.contains(mate)) {
            System.out.println(this + " You are already in the chat " + mate + "...");
        } else {
            roomMates.add(mate);
            System.out.println(this.toString() + mate + " entered the chat...");
        }

    }

    // to exit from room
    @Override
    public void fairwell(RoomMate mate) {
        if (roomMates.contains(mate)) {
            roomMates.remove(mate);
            System.out.println(this+""+mate+ " has left the chat...");
        } else {
            roomMates.add(mate);
            System.out.println(this +""+ mate + " You cannot leave the chat twice nigga 😒...");
        }

    }

    // to send msg to all the roommates excluding the sender roommate
    @Override
    public void sendMessage(RoomMate roomMate, String msg) {
        if (roomMates.isEmpty()) {
            System.out.println(this + " SSSHHH, There is no one here. Go Fuck Some where else 😎");
        }else if (roomMates.contains(roomMate) && roomMates.size()==1){
            System.out.println(this + " Manhoos ho tum . tum yahan bhi single hi maro ge.\n No one in the chat other than you");
        }
        else {
            for (RoomMate mate : roomMates) {
                if (mate != roomMate) {
                    mate.receiveMessage(roomMate, msg);
                }
            }
        }

    }

    // to know if a mate exist in the room
    @Override
    public boolean hasRoomMate(RoomMate roomMate) {
        return roomMates.contains(roomMate);
    }

    @Override
    public void printRoomMates() {

        // to exit if there are no roommates
        if (getRoomMates().isEmpty()) {
            System.out.format("[%s] There is no one in this Chat 😘...\n", this);
            return;
        }
        // to print  if there are  roommates
        System.out.println("Current RoomMates are : ");
        for (RoomMate mate : roomMates) {
            System.out.println(mate);
        }
    }

    @Override
    public String toString() {
        return "[ Tarka Group Chat ] : ";
    }

    public List<RoomMate> getRoomMates() {
        return roomMates;
    }
}

package mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, User msgSender) {
       for (User chatUser : users){
           if (!(chatUser.equals(msgSender))){
               chatUser.receive(msg);
           }
       }

    }

    @Override
    public void addUser(User user) {
        if (users.contains(user)) {
            System.out.println("----> You are already in the chat room :"+user.getName());
        } else {
            users.add(user);
            System.out.println("\tWelcome to the chatRoom >>>>>" + user.getName());
        }
    }
}


package Mediator_SIngleton;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChatMediatorImplementation implements ChatMediator {
    List<User> userList = new CopyOnWriteArrayList<>();


    @Override
    public void sendMessage(String msg, User user) {
        if (msg.contains("addBot")) {
            addBot();
        }

        for (User chatUser : userList) {
            if (chatUser != user) {
                chatUser.receiveMessage(msg, user);
            }
        }
        System.out.println();
    }

    private void addBot() {
        ChatBot chatBot = ChatBot.getInstance();
        chatBot.addMediator(this);
        this.addUser(chatBot);
    }


    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    public void ban(User user, User mod, String msg) {
        if (userList.contains(user)) {
            userList.remove(user);
            sendMessage(msg, mod);
        }
    }
}


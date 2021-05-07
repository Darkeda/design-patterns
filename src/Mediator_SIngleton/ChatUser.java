package Mediator_SIngleton;


public class ChatUser extends User {


    public ChatUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println(name+" send message: "+ msg);
        chatMediator.sendMessage(msg,this);
    }

    @Override
    public void receiveMessage(String msg,User user) {
        System.out.println(name + " received message: "+ msg);
    }
}

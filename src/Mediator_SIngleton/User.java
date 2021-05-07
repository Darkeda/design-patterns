package Mediator_SIngleton;

public abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public User() {

    }


    public abstract void sendMessage(String msg);

    public abstract void receiveMessage(String msg, User user);

    public void setChatMediator(ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChatMediator getChatMediator() {
        return chatMediator;
    }

    public String getName() {
        return name;
    }
}

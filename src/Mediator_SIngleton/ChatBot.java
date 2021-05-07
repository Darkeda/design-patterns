package Mediator_SIngleton;

public class ChatBot extends User {
    private static ChatBot instance = new ChatBot();


    private ChatBot() {
        this.name = "FilterBot";
    }

    public static ChatBot getInstance() {
        return instance;
    }

    public void addMediator(ChatMediator mediator) {
        this.chatMediator = mediator;
    }

    @Override
    public void sendMessage(String msg) {
        chatMediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg, User user) {
        if (msg.contains("cat")) {
            String str = (" A User has been banned for using word cat");

            chatMediator.ban(user, this, str);
        }
    }
}

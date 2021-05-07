package Mediator_SIngleton;

public class main {
    public static void main(String[] args) {
        ChatMediatorImplementation chatMediatorImplementation = new ChatMediatorImplementation();
        ChatUser chatUser1 = new ChatUser(chatMediatorImplementation,"User1");
        ChatUser chatUser2 = new ChatUser(chatMediatorImplementation,"User2");
        ChatUser chatUser3 = new ChatUser(chatMediatorImplementation,"User3");
        ChatUser chatUser4 = new ChatUser(chatMediatorImplementation,"User4");
        ChatUser chatUser5 = new ChatUser(chatMediatorImplementation,"User5");

        chatMediatorImplementation.addUser(chatUser1);
        chatMediatorImplementation.addUser(chatUser2);
        chatMediatorImplementation.addUser(chatUser3);
        chatMediatorImplementation.addUser(chatUser4);
        chatMediatorImplementation.addUser(chatUser5);

        chatUser1.sendMessage("addBot");
        chatUser1.sendMessage("Hello!");
        chatUser1.sendMessage("cat");
        chatUser2.sendMessage("wow that was unexpected");
        chatUser3.sendMessage("cat");
        chatUser4.sendMessage("What was he thinking was?");

    }
}

package Mediator_SIngleton;

public interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);

    void ban(User whoToBan, User moderator, String reason);
}

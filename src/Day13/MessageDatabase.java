package Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages(){
        for (Message message : messages) {
            System.out.println(message.getText());

        }

        return messages;
    }

    public static void showDialog(User u1, User u2){
        for (Message message : messages) {
            if (message.getSender() == u1 && message.getReceiver() == u2
                    || message.getSender() == u2 && message.getReceiver() == u1){
                System.out.println(message.getSender().getUsername() + " : " + message.getText());
            }
        }
    }
}

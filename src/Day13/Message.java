package Day13;

import java.util.Date;

//Сообщение
public class Message {
    private User sender; //отправитель
    private User receiver; //получатель
    private String text; // текст сообщения
    private Date date; // дата отправления сообщения


    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return  "FROM: " + sender.getUsername() +
                "\nTO: " + receiver.getUsername() +
                "\nON: " + date +
                "\n" + text + "\n";
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }
}

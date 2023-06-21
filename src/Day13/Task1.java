package Day13;


import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Max");
        User user2 = new User("Tanya");
        User user3 = new User("Katy");
        user1.setSubscriptions(new ArrayList<>(Arrays.asList(user2,user3)));
        user2.setSubscriptions(new ArrayList<>(Arrays.asList(user1)));
        System.out.println(user1.isSubscribed(user2));
        System.out.println(user1.isFriend(user2));

        user1.sendMessage(user2, "Привет " + user2.getUsername());
        user1.sendMessage(user2, "Как твои дела?");

        user2.sendMessage(user1, "Оооо.. Привет " + user1.getUsername());
        user2.sendMessage(user1, "У меня все олично");
        user2.sendMessage(user1, "Как у тебя?");

        user1.sendMessage(user3, "Скинь дз");

        MessageDatabase.showDialog(user1, user2);

    }
}

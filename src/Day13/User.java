package Day13;

import java.util.ArrayList;
import java.util.List;

//Пользователь
public class User {
    private String username;
    private List<User> subscriptions;//В этом списке должны храниться те пользователи, на которых подписан пользователь.


    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    //подписывает пользователя на пользователя user
    public void subscribe(User user){
        subscriptions.add(user);
    }

    // возвращает True, если пользователь подписан на пользователя user и False, если не подписан.
    public boolean isSubscribed(User user){
        return subscriptions.contains(user);
    }

    //возвращает True, если пользователь user является другом и False, если пользователь user не является другом.
    public boolean isFriend(User user){
        return subscriptions.contains(user) && user.subscriptions.contains(this);
    }

    //отправляет сообщение с текстом text пользователю user. Здесь должен использоваться статический метод из MessageDatabase.
    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }
}

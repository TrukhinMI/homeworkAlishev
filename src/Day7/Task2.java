package Day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player player1 = new Player(random.nextInt(90, 101));
        Player player2 = new Player(random.nextInt(90, 101));
        Player player3 = new Player(random.nextInt(90, 101));
        Player player4 = new Player(random.nextInt(90, 101));
        Player player5 = new Player(random.nextInt(90, 101));
        Player player6 = new Player(random.nextInt(90, 101));
        Player player7 = new Player(random.nextInt(90, 101));


        while (player1.getStamina() != 0){
            player1.run();
        }





        Player.info();

    }
}

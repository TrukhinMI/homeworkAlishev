package Day7;

public class Player {
    private int stamina;

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers >= 6){
            System.out.println("Ждите скоро будет место");
        }
        else
            countPlayers++;
    }

    public void run(){
        stamina--;
        if (stamina <= 0)
            Player.countPlayers--;

    }

    public static void info(){
        if(countPlayers < 6)
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        else
            System.out.println("На поле нет свободных мест");
    }
    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}

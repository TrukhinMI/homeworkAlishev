package Day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("AAA", 2000, new ArrayList<>(Arrays.asList("Иванов", "Зайцев")));
        MusicBand musicBand2 = new MusicBand("BBB", 2001, new ArrayList<>(Arrays.asList("Фролов", "Гусев")));

        musicBand1.setMembers(MusicBand.transferMembers(musicBand1, musicBand2));

        System.out.println("Уастники группы " + musicBand1.getName());
        musicBand1.printMembers();

        System.out.println("Уастники группы " + musicBand2.getName());
        musicBand2.printMembers();

    }
}

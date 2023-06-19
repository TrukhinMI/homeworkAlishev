package Day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("AAA", 2000, new ArrayList<>(Arrays.asList(
                new MusicArtist("Иванов", 25),
                new MusicArtist("Сидоров", 18))));

        MusicBand musicBand2 = new MusicBand("BBB", 2010, new ArrayList<>(Arrays.asList(
                new MusicArtist("Федоров", 33),
                new MusicArtist("Ашкол", 22))));

        musicBand1.setMusicArtistList(MusicBand.transferMembers(musicBand1, musicBand2));

        System.out.println("Уастники группы " + musicBand1.getName());
        musicBand1.printMembers();

        System.out.println("Уастники группы " + musicBand2.getName());
        musicBand2.printMembers();

    }
}

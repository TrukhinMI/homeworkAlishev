package Day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>(Arrays.asList(
                new MusicBand("AAA", 2002),
                new MusicBand("BBB", 1980),
                new MusicBand("CCC", 2020),
                new MusicBand("DDD", 2017),
                new MusicBand("EEE", 1970),
                new MusicBand("FFF", 1993),
                new MusicBand("GGG", 2023),
                new MusicBand("JJJ", 2014),
                new MusicBand("III", 2017)

        ));

        Collections.shuffle(musicBandList);

        for (MusicBand musicBand: musicBandList) {
            System.out.println("Название группы: " + musicBand.getName() + ", год основания " + musicBand.getYear());
        }

        musicBandList = groupsAfter2000(musicBandList);

        System.out.println("Группы основанные после 2000");
        for (MusicBand musicBand: musicBandList) {
            System.out.println("Название группы: " + musicBand.getName() + ", год основания " + musicBand.getYear());
        }

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> musicBandList = new ArrayList<>();
        for (MusicBand musicBand : bands) {
            if (musicBand.getYear() > 2000)
                musicBandList.add(musicBand);
        }

        return musicBandList;
    }
}

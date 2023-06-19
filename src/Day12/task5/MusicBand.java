package Day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtistList;

    public MusicBand(String name, int year, List<MusicArtist> musicArtistList) {
        this.name = name;
        this.year = year;
        this.musicArtistList = musicArtistList;
    }

    public static List<MusicArtist> transferMembers(MusicBand listMembers1, MusicBand listMembers2){
        List<MusicArtist> musicArtistList1 = new ArrayList<>();
        musicArtistList1.addAll(listMembers1.getMusicArtistList());
        musicArtistList1.addAll(listMembers2.getMusicArtistList());
        listMembers2.getMusicArtistList().clear();
        return  musicArtistList1;
    }


       public void printMembers(){
           for (MusicArtist musicArtist : musicArtistList){
               System.out.println(musicArtist.getName() + " " + musicArtist.getAge());
           }
       }


    public List<MusicArtist> getMusicArtistList() {
        return musicArtistList;
    }

    public void setMusicArtistList(List<MusicArtist> musicArtistList) {
        this.musicArtistList = musicArtistList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

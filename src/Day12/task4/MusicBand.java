package Day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static List<String> transferMembers(MusicBand listMembers1, MusicBand listMembers2){
        List<String> list = new ArrayList<>();
        list.addAll(listMembers1.getMembers());
        list.addAll(listMembers2.getMembers());
        listMembers2.getMembers().clear();
        return list;
    }



    public void printMembers(){
        for (String member : getMembers()) {
            System.out.println(member);
        }
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
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

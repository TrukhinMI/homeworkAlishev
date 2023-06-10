package Day6;

public class Motobike {
    private String model;
    private String color;
    private int year;



    void info(){
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int inputYear){
        if (inputYear >= year)
            return inputYear - year;
        else
            return year - inputYear;
    }

    public Motobike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}

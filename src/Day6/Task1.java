package Day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car("Audi", "Белый", 2023);
        Motobike motobike = new Motobike("Kawasaki", "Красный", 2008);

        car.info();
        System.out.println(car.yearDifference(2014));

        motobike.info();
        System.out.println(motobike.yearDifference(2014));


        Airplane airplane = new Airplane("Эйрбас", 2019, 47.6, 5.34);
        airplane.setLength(48.9);
        airplane.setYear(2020);
        airplane.fillUp(700);
        airplane.fillUp(347);

        airplane.info();
    }
}

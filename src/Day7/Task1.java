package Day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Bogt", 2020, 123, 100);
        Airplane airplane2 = new Airplane("Gofr", 2020, 135, 107);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}

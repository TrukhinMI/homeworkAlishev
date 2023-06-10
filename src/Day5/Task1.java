package Day5;

public class Task1 {
    public static void main(String[] args) {
        Car carAUdi = new Car();
        carAUdi.setModel("Audi A6");
        carAUdi.setColor("Белый");
        carAUdi.setYear(2023);

        System.out.println("Модель: " + carAUdi.getModel() + ", цвет: " + carAUdi.getColor() + ", год: " + carAUdi.getYear());
    }
}

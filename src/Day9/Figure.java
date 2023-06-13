package Day9;

public abstract class Figure {
    String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double area();// площадь фигуры
    public abstract double perimeter();//периметр фигуры

    public String getColor() {
        return color;
    }
}

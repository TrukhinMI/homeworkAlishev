package Day9;

public class Rectangle extends Figure{
    private double width, height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return getHeight() * getWidth();
    }

    @Override
    public double perimeter() {
        return 2.0 * (getWidth() + getHeight());
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

package Day9;

public class Triangle extends Figure{
    private double lengthA, lengthB, lengthC;

    public Triangle(String color, double length1, double length2, double length3) {
        super(color);
        this.lengthA = length1;
        this.lengthB = length2;
        this.lengthC = length3;
    }

    @Override
    public double area() {
        double p = perimeter() / 2.0;
        return Math.sqrt(p * (p- getLengthA()) * (p- getLengthB()) * (p- getLengthC())) ;
    }

    @Override
    public double perimeter() {
        return getLengthA() + getLengthB() + getLengthC();
    }

    public double getLengthA() {
        return lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }






}

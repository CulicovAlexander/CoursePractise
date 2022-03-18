package lesson.interfacePractise;

public class Rectangle implements GeometricObject{

    private double height;
    private double length;

    public Rectangle(double height, double length){
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        double S = 0.5 * (length * height);
        return S;
    }

    @Override
    public double getPerimeter() {
        double P = Math.abs(Math.pow(length,2)) + Math.abs(Math.pow(height,2)) + length + height;
        return P;
    }
}

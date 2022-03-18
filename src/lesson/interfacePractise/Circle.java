package lesson.interfacePractise;

public class Circle implements GeometricObject{

    private double radius;

    public Circle (double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double S = 3.14 * Math.pow(radius, 2);
        return S;
    }

    @Override
    public double getPerimeter() {
        double P = 2 * 3.14 * radius;
        return P;
    }
}

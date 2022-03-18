package lesson.shapes;

public class Circle extends TwoDimensionalShape{

    public void circleArea(double dimension){
        double S = 3.14 * Math.pow(dimension, 2);
        System.out.println("the area of the circle is - " + S);
    }
}

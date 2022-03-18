package lesson.shapes;

public class Square extends TwoDimensionalShape{

    public void squareArea(double dimension){
        double S = dimension * dimension;
        System.out.println("The area of the square is - " + S);
    }
}

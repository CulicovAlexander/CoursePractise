package lesson.interfacePractise;

public class ShapeTest {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("The area of the circle is - " + circle.getArea());
        System.out.println("The perimeter of the circle is - " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("The area of the rectangle is - " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is - " + rectangle.getPerimeter());
    }
}

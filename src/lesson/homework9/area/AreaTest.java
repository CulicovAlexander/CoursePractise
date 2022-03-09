package lesson.homework9.area;

public class AreaTest {
    public static void main(String[] args) {
        Area example = new Area();
        example.setDim();
        double exampleArea = example.getArea();
        System.out.printf("The rectangle's area is: %.2f", exampleArea);
    }
}

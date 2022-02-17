package lesson.ninth.homework.area;

import lesson.ninth.homework.area.Area;

public class AreaTest {
    public static void main(String[] args) {
        Area example = new Area();
        example.setDim();
        double exampleArea = example.getArea();
        System.out.printf("The rectangle's area is: %.2f", exampleArea);
    }
}

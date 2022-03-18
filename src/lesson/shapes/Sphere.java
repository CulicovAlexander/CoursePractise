package lesson.shapes;

public class Sphere extends ThreeDimensionalShape{

    public void sphereArea (double dimension) {
        double S = 4 * 3.14 * Math.pow(dimension, 2);
        System.out.println("The area of Sphere is - " + S);
    }

    public void sphereVolume (double dimension) {
        double V = 4/3 * 3.14 * Math.pow(dimension, 3);
        System.out.println("The volume of Sphere is - " + V);

    }
}

package lesson.shapes;

public class Cube extends ThreeDimensionalShape {

    public void cubeArea (double dimension) {
        double S = 6 * Math.pow(dimension, 2);
        System.out.println("The area of the Cube is - " + S);
    }

    public void cubeVolume (double dimension) {
        double V = Math.pow(dimension, 3);
        System.out.println("The volume of the Cube is - " + V);
    }
}

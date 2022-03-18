package lesson.shapes;

public class ShapeTest {
    public static void main(String[] args) {

        TwoDimensionalShape twoDimensionalShape = new TwoDimensionalShape();
        twoDimensionalShape.setDimension(5);

        Circle circle = new Circle();
        circle.circleArea(twoDimensionalShape.getDimension());

        Square square = new Square();
        square.squareArea(twoDimensionalShape.getDimension());

        ThreeDimensionalShape threeDimensionalShape = new ThreeDimensionalShape();
        threeDimensionalShape.setDimension(5);

        Sphere sphere = new Sphere();
        sphere.sphereArea(threeDimensionalShape.getDimension());
        sphere.sphereVolume(threeDimensionalShape.getDimension());

        Cube cube = new Cube();
        cube.cubeArea(threeDimensionalShape.getDimension());
        cube.cubeVolume(threeDimensionalShape.getDimension());
    }
}

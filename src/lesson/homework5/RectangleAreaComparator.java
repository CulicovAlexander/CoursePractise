package lesson.homework5;
import java.util.Scanner;

public class RectangleAreaComparator {
    public static void main(String[] args) {

        Scanner inputLength = new Scanner(System.in);
        Scanner inputWidth = new Scanner(System.in);

        System.out.println("Enter length of the first rectangle");
        float length1 = inputLength.nextFloat();

        System.out.println("Enter width of the first rectangle");
        float width1 = inputWidth.nextFloat();

        float area1 = length1 * width1;

        System.out.println("Enter length of the second rectangle");
        float length2 = inputLength.nextFloat();

        System.out.println("Enter length of the second rectangle");
        float width2 = inputLength.nextFloat();

        float area2 = length2 * width2;

        if (area1 > area2) {
            System.out.println("Area of the first rectangle is bigger");
        } else if (area1 < area2) {
            System.out.println("Area of the second rectangle is bigger");
        } else {
            System.out.println("Areas are equal");
        }
    inputLength.close();
    inputWidth.close();
    }
}

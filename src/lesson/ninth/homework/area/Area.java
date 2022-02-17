package lesson.ninth.homework.area;
import java.util.Scanner;


public class Area {

        private Scanner input = new Scanner(System.in);
        private double height;
        private double width;

        public void setDim() {
            System.out.println("Please enter the height of the rectangle");
            width = inputValidate();
            System.out.println("Please enter the height of the rectangle");
            height = inputValidate();
            input.close();
        }

        public double getArea(){
            return width * height;
        }

        private double inputValidate() {
            double checker = input.nextDouble();
            while (checker<=0) {
                System.out.println("Value cannot be a negative value \n" +
                                   "Please enter valid value");
                checker = input.nextDouble();
            }
            return checker;
        }
}


package lesson.fifth5.homework;
import java.util.Scanner;
import java.lang.Math;

public class FloatingPointAnalyzer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value");
        double value = input.nextDouble();

        if (value == 0){
            System.out.println("The value is zero");
            if (Math.abs(value)<1){
                System.out.println("The number is small");
            } else if (Math.abs(value)>1_000_000){
                System.out.println("The number is large");
            } else {
                System.out.println("The number is normal size");
            }
        } else if (value > 0){
            System.out.println("The value is positive");
            if (Math.abs(value)<1){
                System.out.println("The number is small");
            } else if (Math.abs(value)>1_000_000){
                System.out.println("The number is large");
            } else {
                System.out.println("The number is normal size");
            }
        } else {
            System.out.println("The value is negative");
        }

    input.close();
    }
}

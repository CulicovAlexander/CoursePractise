package lesson.sixth.homework;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        System.out.println("Please enter the color code 100 101 or 102");
        Scanner input = new Scanner(System.in);
        int colorCode = input.nextInt();


        String color;

        color = (colorCode == 100)? "Yellow" : (colorCode == 101)? "Green" : (colorCode == 102)?
                "Red" : "Invalid";

        System.out.println(color);
    }
}


package lesson.homework19;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = input.nextInt();

        if ((year % 400 == 0)
                || ((year % 4 == 0) && (year % 100 != 0))){

            System.out.println("Leap year - " + year);

        } else {

            System.out.println("The year is not leap");

        }
    }
}

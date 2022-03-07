package lesson.homework15.calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CalendarLogic obj = new CalendarLogic();

        System.out.println("Please enter the year");
        obj.setYear(input.nextInt());

        System.out.println("Please enter the month");
        obj.setMonth(input.nextInt());

        System.out.println("Please enter the day");
        obj.setDay(input.nextInt());

        obj.printDate();
    }
}

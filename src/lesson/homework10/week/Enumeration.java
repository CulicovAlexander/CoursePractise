package lesson.homework10.week;

public class Enumeration {
    public static void main(String[] args) {

        System.out.println(Weekday.MONDAY.isWeekDay());
        System.out.println(Weekday.MONDAY.isWeekend());
        System.out.println(Weekday.SUNDAY.isWeekend());
        System.out.println(Weekday.SUNDAY.isWeekDay());

    }
}

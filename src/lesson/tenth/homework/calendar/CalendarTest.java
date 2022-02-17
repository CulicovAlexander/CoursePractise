package lesson.tenth.homework.calendar;

public class CalendarTest {
    public static void main(String[] args) {

        Calendar current = Calendar.February;
        System.out.println("The month is " + current);

        for (Calendar calendar : Calendar.values() ){
            System.out.println(calendar);
        }


    }
}

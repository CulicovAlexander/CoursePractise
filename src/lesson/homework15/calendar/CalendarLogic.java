package lesson.homework15.calendar;

public class CalendarLogic {

    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = Validator.dayValidation(day, month);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = Validator.monthValidation(month);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = Validator.yearValidation(year);
    }

    public void printDate(){
        System.out.print(day + "/");
        System.out.print(month + "/");
        System.out.print(year);
    }
}

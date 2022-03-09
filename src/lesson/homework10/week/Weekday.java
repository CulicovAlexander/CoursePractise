package lesson.homework10.week;

public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay() {
        return this != SATURDAY && this !=SUNDAY;
    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

}

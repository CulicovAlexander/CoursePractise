package lesson.homework4;

public class MinutesConverter {
    public static void main(String[] args) {
        long minutes = 600L;
        double days = minutes / 60.0 / 24.0;
        double years =minutes / 60.0 / 24.0 / 365.0;
        System.out.println("Days " + days);
        System.out.println("Years " + years);
    }
}

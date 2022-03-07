package lesson.homework15.calendar;

import java.util.Scanner;

public class Validator {

    public static int yearValidation(int year){
        while (year <= 0){
            System.err.println("Invalid input, please try again");
            Scanner correctedInput = new Scanner(System.in);
            year = correctedInput.nextInt();
        }
        return year;
    }
    public static int monthValidation(int month){
        while (month > 12 || month < 1) {
            System.err.println("Invalid input, please try again");
            Scanner correctedInput = new Scanner(System.in);
            month = correctedInput.nextInt();
        }
        return month;
    }
    public static int dayValidation(int day, int month){

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            while (day > 31 || day < 1){
                System.err.println("Invalid input, please try again");
                Scanner correctedInput = new Scanner(System.in);
                day = correctedInput.nextInt();
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11){
            while (day > 30 || day < 1){
                System.err.println("Invalid input, please try again");
                Scanner correctedInput = new Scanner(System.in);
                day = correctedInput.nextInt();
            }
        }
        if (month == 2){
            while (day > 28 || day < 1){
                System.err.println("Invalid input, please try again");
                Scanner correctedInput = new Scanner(System.in);
                day = correctedInput.nextInt();
            }
        }
        return day;
    }
}

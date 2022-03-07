package lesson.homework15.invoice;

import java.util.Scanner;

public class Validator {

    public static int inputValidation(int inputValidation) {
        if (inputValidation <= 0) {
            inputValidation = 0;
        }
        return inputValidation;
    }
    public static double inputValidation (double inputValidation){
        if (inputValidation <= 0) {
            inputValidation = 0.0;
        }
        return inputValidation;
    }
}

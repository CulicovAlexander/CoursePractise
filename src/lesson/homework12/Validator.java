package lesson.homework12;
import java.util.Scanner;

public class Validator {

    public int inputValidation (int inputValidation){
        while (inputValidation <= 0){
            System.err.println("Invalid input, the duration cannot be negative, please try again");
            Scanner correctedInput = new Scanner(System.in);
            inputValidation = correctedInput.nextInt();
            System.out.println("Corrected value - " + inputValidation);
        }
        return inputValidation;
    }
}

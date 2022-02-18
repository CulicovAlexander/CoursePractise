package lesson.seventh.homework;
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {

        boolean menuRepeat = true;

        do {
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter the first number");
            int firstNum = input.nextInt();

            System.out.println("Please enter the second number");
            int secondNum = input.nextInt();

            int sum = firstNum + secondNum;
            System.out.println("The sum is " + sum);

            System.out.println("would you like to repeat the procedure? Y/N");
            Scanner userInput = new Scanner(System.in);
            String result = userInput.nextLine();


            if (result.equals("N")){
                menuRepeat = false;

                input.close();
            }



        } while (menuRepeat);

        System.out.println("Shutting down");

    }
}

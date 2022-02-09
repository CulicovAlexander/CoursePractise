package lesson.seventh.homework;
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {

        boolean menuRepeat = true;

        do {

            System.out.println("Please enter the first number");
            Scanner inputFirstNum = new Scanner(System.in);
            int firstNum = inputFirstNum.nextInt();

            System.out.println("Please enter the second number");
            Scanner inputSecondNum = new Scanner(System.in);
            int secondNum = inputSecondNum.nextInt();


            int sum = firstNum + secondNum;
            System.out.println("The sum is " + sum);

            System.out.println("would you like to repeat the procedure? Y/N");
            Scanner userInput = new Scanner(System.in);
            String result = userInput.nextLine();

            if (result.equals("N")){
                menuRepeat = false;
            }



        } while (menuRepeat == true);

        System.out.println("Shutting down");

        }
    }

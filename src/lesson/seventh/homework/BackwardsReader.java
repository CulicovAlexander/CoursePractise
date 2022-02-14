package lesson.seventh.homework;
import java.util.Scanner;


public class BackwardsReader {
    public static void main(String[] args) {

        System.out.println("Please enter a positive number");
        Scanner input = new Scanner(System.in);
        int forward = input.nextInt();

        if (forward < 0){

            System.out.println("Invalid input");

        } else {

            String backwardText=String.valueOf(forward);
            char backward [];
            backward = backwardText.toCharArray();
            int z = backward.length - 1;

            for (int num = z; num >= 0; num--) {

                System.out.print(backward[num]);

            }
        }
    }
}

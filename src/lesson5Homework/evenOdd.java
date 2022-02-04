package lesson5Homework;
import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");

            int num = input.nextInt();
            int numCheck = num % 2;

            if ( numCheck > 0) {
                System.out.println("The number is Odd");
            } else {
                System.out.println("The number is Even");
            }
        input.close();
    }
}

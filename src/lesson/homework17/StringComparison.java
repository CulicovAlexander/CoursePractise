package lesson.homework17;
import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first line");
        String firstString = input.nextLine();

        System.out.println("Please enter first line");
        String secondString = input.nextLine();

        if (firstString.equalsIgnoreCase(secondString)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        input.close();
    }
}

package lesson.eighth.homework;
import java.util.Scanner;

public class SpecificValueDetector {
    public static void main(String[] args) {

        System.out.println("Please specify the value");
        Scanner input = new Scanner(System.in);
        int specificValue = input.nextInt();


        System.out.println("Please enter the size of the array");
        Scanner input2 = new Scanner(System.in);
        int value = input2.nextInt();

        int arr[] = new int [value];

        for (int i = 0; i < arr.length; i++){

            System.out.println("Please enter the " + i + " value");
            Scanner input3 = new Scanner(System.in);
            int arrayInput = input3.nextInt();
            arr[i] = arrayInput;

        }

        for (int j : arr) {
            if (j == specificValue) {
                System.out.println("The array contains the value");
                break;
            }
        }
    }
}

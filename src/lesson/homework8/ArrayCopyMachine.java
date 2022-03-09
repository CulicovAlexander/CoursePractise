package lesson.homework8;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyMachine {
    public static void main(String[] args) {

        System.out.println("Please introduce the size of the array");
        Scanner inputSize = new Scanner(System.in);
        int i = inputSize.nextInt();

        int[] usersArray = new int [i];
        int[] copiedArray = new int [i];

        for (int num = 0 ; num < i; num++){
            System.out.println("Please introduce the variable number " + num);
            usersArray[num] = inputSize.nextInt();
        }
        for (int num = 0; num < i; num ++) {
            copiedArray[num] = usersArray[num];
        }
        System.out.println("The original array is -" + Arrays.toString(usersArray));

        System.out.println("The copy of an array is - " + Arrays.toString(copiedArray));

        inputSize.close();
    }
}

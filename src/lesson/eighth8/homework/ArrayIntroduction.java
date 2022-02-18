package lesson.eighth8.homework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntroduction {
    public static void main(String[] args) {

        System.out.println("Please introduce the size of the array");
        Scanner inputSize = new Scanner(System.in);
        int i = inputSize.nextInt();

        int[] usersArray = new int [i];

        for (int num = 0 ; num < i; num++){
            System.out.println("Please introduce the variable number " + num);
            usersArray[num] = inputSize.nextInt();
        }
        System.out.println("The array is " + Arrays.toString(usersArray));
        inputSize.close();
    }
}

package lesson.homework8;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {

        System.out.println("Please introduce the size of the array");
        Scanner inputSize = new Scanner(System.in);
        int i = inputSize.nextInt();

        int[] usersArray = new int [i];

        for (int num = 0 ; num < i; num++){
            System.out.println("Please introduce the variable number " + num);
            usersArray[num] = inputSize.nextInt();
        }
        int max = 0;

        for (int j : usersArray) {
            if (j > max) {
                max = j;
            }
        }

        int min = usersArray[0];

        for (int j : usersArray) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("The maximum value is - " + max);
        System.out.println("The minimum value is - " + min);
    }
}

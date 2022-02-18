package lesson.eighth8.homework;

import java.util.Arrays;

public class OneTwoDimensionalArrayOddEvenSumAvg {
    public static void main(String[] args) {

        int oneDimensionExample[] = new int [] {1,2,3,4,5,6,7,8,9,10};
        int[][] twoDimensionalExample = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

        int evenSum = 0;
        double oddSum = 0;

        int twoEvenSum = 0;
        double twoOddSum = 0;

        int numOfOddElements = 0;
        int numOfEvenElements = 0;

        int twoNumOfOddElements = 0;
        int twoNumOfEvenElements = 0;

        for (int i : oneDimensionExample) {
            if (i % 2 == 0) {
                evenSum += i;
                numOfEvenElements += 1;
            }
        }
        System.out.println("The sum of even numbers is - " + evenSum
                + "\n" + "The number of even numbers is - " + numOfEvenElements);

        int evenAverage = evenSum / oneDimensionExample.length;
        System.out.println("The average of even numbers is - " + evenAverage);

        for (int i : oneDimensionExample) {
            if (i % 2 != 0) {
                oddSum += i;
                numOfOddElements += 1;
            }
        }

        System.out.println("The sum of odd numbers is - " + oddSum +"\n"
                + "The number of Odd elements is -" + numOfOddElements);
        double oddAverage = oddSum / oneDimensionExample.length;
        System.out.println("The average of odd numbers is - " + oddAverage);

        for (int i = 0; i < twoDimensionalExample.length; i++) {
            for (int j = 0; j < twoDimensionalExample[i].length; j++){
                if (twoDimensionalExample[i][j] % 2 == 0) {
                    twoEvenSum += twoDimensionalExample[i][j];
                    twoNumOfEvenElements += 1;
                }
            }
        }
        System.out.println("The sum of even numbers is in two dimensional array is - " + twoEvenSum + "\n"
                            + "The number of even elements is - " + twoNumOfEvenElements);
        int twoEvenAverage = twoEvenSum / 5;
        System.out.println("The average of even numbers in two dimensional array is - " + twoEvenAverage);

        for (int i = 0; i < twoDimensionalExample.length; i++) {
            for (int j = 0; j < twoDimensionalExample[i].length; j++){
                if (twoDimensionalExample[i][j] % 2 != 0) {
                    twoOddSum += twoDimensionalExample[i][j];
                    twoNumOfOddElements += 1;
                }
            }
        }
        System.out.println("The sum of even numbers is in two dimensional array is - " + twoOddSum
                + "\n" + "The number of odd numbers is - " + twoNumOfOddElements);
        double twoOddAverage = twoOddSum / 5;
        System.out.println("The average of even numbers in two dimensional array is - " + twoEvenAverage);
    }
}

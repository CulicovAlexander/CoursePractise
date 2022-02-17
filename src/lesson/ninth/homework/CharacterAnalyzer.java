package lesson.ninth.homework;
import java.util.Scanner;


public class CharacterAnalyzer {
    public static void main(String[] args) {

    char testChar ='a';

    System.out.println("Please enter the string");
    Scanner input = new Scanner(System.in);
    String material = input.nextLine();

    char charArrayInput [];
    charArrayInput = material.toCharArray();
    int testCharNum = 1;


    for (int i = charArrayInput.length - 1; i > 0; i--){
       if (charArrayInput[i] == testChar){
           testCharNum++;
       }
   }
   System.out.println("The number of characters is - " + testCharNum);

    }
}
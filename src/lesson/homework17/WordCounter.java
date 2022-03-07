package lesson.homework17;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please the string");
        String stringToProcess = input.nextLine();
        String stringProcessed = stringToProcess.trim().replaceAll(" +", " ");

        char[] stringProcessedChar = stringProcessed.toCharArray();

        int g = 0;

        for (char c : stringProcessedChar) {

            if (c == ' ') {
                g += 1;
            }
        }
        int numOfWords = g + 1;
        System.out.println("The number of words is - " + numOfWords);
    }
}

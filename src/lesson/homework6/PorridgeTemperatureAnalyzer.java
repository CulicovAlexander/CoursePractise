package lesson.homework6;
import java.util.Scanner;

public class PorridgeTemperatureAnalyzer {
    public static void main(String[] args) {

        System.out.println("Please enter the temperature");
        Scanner input = new Scanner(System.in);
        int temperature = input.nextInt();


        int maxTemp = 100;
        int minTemp = 25;

        if (temperature > maxTemp){
            System.out.println("Porridge is too hot.");
        }
            if (temperature < minTemp) {
                System.out.println("Porridge is too cold.");
            }
            else {
                System.out.println("Porridge is just right.");
            }

            input.close();
    }
}

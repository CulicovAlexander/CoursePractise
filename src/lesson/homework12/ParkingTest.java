package lesson.homework12;
import java.util.Scanner;

public class ParkingTest {
    public static void main(String[] args) {

        ParkingLogic customer = new ParkingLogic();
        Validator inputProcessing = new Validator();
        Scanner input = new Scanner(System.in);

        boolean menu = true;

        while (menu) {

            System.out.println("New client ? - type 1");
            System.out.println("Total running ? - type 2");
            System.out.println("Shut down the program ? - type 3 \n");

            int clientInput = input.nextInt();

            if (clientInput == 1){
                System.out.println("Please enter the duration of your parking");
                int clientParkDuration = input.nextInt();
                clientParkDuration = inputProcessing.inputValidation(clientParkDuration);

                customer.setParkingDuration(clientParkDuration);
                customer.calculateCharges();

            } else if (clientInput == 2){

                customer.printRunningTotal();

            } else if (clientInput == 3){

                menu = false;

            }
        }
    }
}

package lesson.ninth.homework;
import java.util.Arrays;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        final String pass = "Pa55word";

        for(int i = 0; i < 3; i++){

            System.out.println("Please enter the password");
            Scanner input = new Scanner(System.in);
            String usersPass = input.nextLine();


            if(pass.equals(usersPass)){
            System.out.println("Access granted");
            break;
        } else {
            System.out.println("Wrong password");
            if (i == 2){
                System.out.println("The limit of tries is exceeded");
            }
        }

        }
    }
}

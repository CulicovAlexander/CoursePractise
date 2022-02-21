package lesson.homework12;

public class ParkingLogic {

    public static double runningTotal;

    private int parkingDuration;

    public void setParkingDuration(int parkingDuration){
        this.parkingDuration = parkingDuration;
    }

    public void calculateCharges(){

        if (parkingDuration <= 3){

            System.out.println("Your fee is - 2.0 USD \n");
            runningTotal += 2;

        } else if (parkingDuration >= 19) {

            System.out.println("Your fee is - 10.0 USD \n");
            runningTotal += 10;

        } else {

            double parsedParkingDuration = parkingDuration;
            double result = (parsedParkingDuration - 3) / 2;
            System.out.println("Your fee is - " + (2 + result) + " USD \n");

            runningTotal += 2 + result;
        }
    }

    public void printRunningTotal(){
        System.out.println("The running total is - " + runningTotal + "\n");
    }

}

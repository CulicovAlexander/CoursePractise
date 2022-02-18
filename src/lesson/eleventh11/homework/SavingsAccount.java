package lesson.eleventh11.homework;

public class SavingsAccount {

    private static double annualInterestRate;

    private double savingsBalance;

    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }

    public double calculateInterestRate(){
       return savingsBalance + savingsBalance * annualInterestRate /12;

    }

    public static void modifyInterestRate(double modifyInterest){
       annualInterestRate = modifyInterest /100;
    }

}

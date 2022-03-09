package lesson.homework11;

public class SavingsTester {
    public static void main(String[] args) {

        SavingsAccount.modifyInterestRate(4);

        SavingsAccount saver1 = new SavingsAccount();
        saver1.setSavingsBalance(2000.00d);
        System.out.printf("First saver balance (4 percent) - %.2f$\n", saver1.calculateInterestRate());

        SavingsAccount saver2 = new SavingsAccount();
        saver2.setSavingsBalance(3000.00d);
        System.out.printf("Second saver balance (4 percent) - %.2f$\n", saver2.calculateInterestRate());

        SavingsAccount.modifyInterestRate(5);

        System.out.printf("First saver balance (5 percent) - %.2f$\n", saver1.calculateInterestRate());

        System.out.printf("Second saver balance (5 percent) - %.2f$\n", saver2.calculateInterestRate());
    }
}

package lesson4Homework;

public class taxCalculator {
    public static void main(String[] args) {
        double price = 256.65;
        double tax = 15.5;
        int quantity = 3;
        double total = price*quantity*tax;
        System.out.println("Total cost with tax is: " + total);
    }
}

package lesson.homework15.invoice;

import lesson.homework15.invoice.Invoice;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {

        ArrayList<Invoice> prodList = new ArrayList<>();

        boolean menu = true;
        Invoice obj = new Invoice("Phone","made in china",2,12.5);
        Scanner input = new Scanner(System.in);

        while (menu) {

            System.out.println("Would you like to add another product to the order? 1 \n" +
                    "Would you like to print your order and the overall price? 2");
            int answr = input.nextInt();

            if (answr == 1) {

                System.out.println("Please introduce product's quantity");
                int prodQty = input.nextInt();
                obj.setQty(prodQty);

                System.out.println("Please introduce the product description");
                String prodDes = input.next();
                obj.setProductDescription(prodDes);

                System.out.println("Please introduce product's price");
                double prodPrice = input.nextDouble();
                obj.setPrice(prodPrice);

                System.out.println("Please introduce the device model");
                String devMod = input.next();
                obj.setDeviceModel(devMod);

                prodList.add(new Invoice(devMod, prodDes, prodQty, prodPrice));
                obj.getAmount();
            }

            if (answr == 2){

                for (int i = 0; i < prodList.size(); i++) {

                    System.out.println("Product: " + prodList.get(i).getDeviceModel() +
                           " Production description: " + prodList.get(i).getProductDescription() +
                           " Quantity: " + prodList.get(i).getQty() +
                           " Price: " + prodList.get(i).getPrice());
                           }
                obj.getAmountPrint();
            menu = false;
            }
        }
    }
}


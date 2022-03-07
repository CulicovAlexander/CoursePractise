package lesson.homework15.invoice;

public class Invoice {

    private String deviceModel;
    private String productDescription;
    private int qty;
    private double price;
    static int amount;
    private Invoice[] productsList;

    public Invoice (String deviceModel, String productDescription, int qty, double price){
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        this.qty = Validator.inputValidation(qty);
        this.price = Validator.inputValidation(price);
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setQty(int qty) {
        this.qty = Validator.inputValidation(qty);
    }

    public void setPrice(double price) {
        this.price = Validator.inputValidation(price);
    }

    public void getAmount(){
        double truePrice = qty * price;
        amount += truePrice;
        System.out.println("The overall price - " + amount);

    }
    public void getAmountPrint(){
        System.out.println("The overall price - " + amount);
    }
}

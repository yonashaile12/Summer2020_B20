package Office_Hours.Practice_09_09_2020;

public class Iphone extends Phone {

    /*
    variable: 4
    method: 3
     */

    public Iphone(String model, double price) {
        super(model, price);// set the model and price
    }

    static {
        brand = "iphone";
        madeIn = "USA";
    }

    public void call(long phoneNumber) {
        System.out.println("Iphone " + model + " is calling: " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Iphone " + model + " is texting: " + phoneNumber);
    }

}

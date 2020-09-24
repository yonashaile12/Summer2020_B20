package day57_Polymorphism.PhoneTask;

import day57_Polymorphism.PhoneTask.AndroidApp;
import day57_Polymorphism.PhoneTask.Downloadable;
import day57_Polymorphism.PhoneTask.Phone;

/*
 6. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200
 */
public class Samsung extends Phone implements Downloadable, AndroidApp {

    public Samsung( String model, String size, double price) {
        super("Samsung", model, size, price);

        if(price > 1200){
            throw new RuntimeException("Samsung price can not be greater than $1200");
        }
    }

    @Override
    public void download() {
        System.out.println("Samsung is downloading app from "+appStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}

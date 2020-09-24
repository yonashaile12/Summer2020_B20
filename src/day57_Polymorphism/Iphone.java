package day57_Polymorphism;
/*
5. create a class named iPhone that can inherit from AppleApp and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
            Invalid Price, Iphone' price cannot more than 1500
 */
public class Iphone extends Phone implements Downloadable, AppleApp{

    public Iphone( String model, String size, double price) {
        super("Iphone", model, size, price);
        if(price > 1500){
            throw new RuntimeException("Iphone price can not be greater than $1500");
        }
    }

    @Override
    public void download() {
        System.out.println("Iphone is downloading from "+AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}

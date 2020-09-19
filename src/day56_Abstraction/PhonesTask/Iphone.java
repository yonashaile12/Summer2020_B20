package day56_Abstraction.PhonesTask;

public final class Iphone extends Phone{


    public Iphone(String model, double price, String size) {
        super("Iphone", model, price, size);

        if(price <= 0 || price > 1500){
            throw new RuntimeException("Invalid Price: "+price);
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);
    }

    @Override
    public void texting(long num1, long num2) {
        texting(num1);
        texting(num2);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is faceTiming with "+phoneNumber);
    }

    public void faceTiming(long num1, long num2){
        faceTiming(num1, num2);
    }

    @Override
    public String toString() {
        return "Iphone Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}

package Task;
/*
6. create an abstract class called Laptop that can Inherit from Device
            Variables: screenSize
            Add a cosntructor that can initialize all the fields
                    if the price is set to negative or zero, throw an exception with a message of: Price of the laptop cannot be negative or zero
*/
public abstract class Laptop extends Device{

    public Laptop(String brand, String model, String screenSize, double price) {
        super(brand, model, screenSize, price);
        if(price <= 0){
            throw new RuntimeException("Price of the laptop cannot be negative or zero");
        }
    }

    @Override
    public boolean equal(Device device) {
        return false;
    }
}

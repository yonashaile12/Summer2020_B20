package Task;
/*
Task: Device
    1. create an abstract class called Device
            variables: brand, model, screenSize, price
                    all variables are protected and final (DO Not initialize them yet)
            abstract method: equal(Device device)
 */
public abstract class Device {

    protected final String brand;
    protected final String model;
    protected final String screenSize;
    protected final double price;

    public Device(String brand, String model, String screenSize, double price) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.price = price;
    }

    public abstract boolean equal(Device device);
}

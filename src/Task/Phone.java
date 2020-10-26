package Task;
/*
2. create an abstract class called Phone that can inherit from Device
            variables: screenSize
                Add a constructor that can initialize all the fields
                    if the price is set to negative or zero, throw an exception with a message of:
                    Price of the Phone cannot be negative or zero
                    Abstract methods:
                    call(long number), text(long number), equal(Device device)
 */
public abstract class Phone extends Device{


    public Phone(String brand, String model, String screenSize, double price) {
        super(brand, model, screenSize, price);

        if(price <= 0){
            throw new RuntimeException("Price of the Phone cannot be negative or zero");
        }
    }

    public abstract void call(long phoneNumber);
    public abstract void text(long phoneNumber);
    public abstract boolean equal(Device device);

    public static void main(String[] args) {

    }
}

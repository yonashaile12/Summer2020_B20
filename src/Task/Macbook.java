package Task;
/*
8. create a sub class of Laptop called MacBook (meant to be subclass ONLY) that can inherit from AppleApp
            Add a constructor with three arguments of model, screenSize, price
                call the super class' constructor to initialize all the fields
            Methods:
                faceTiming(String email)
                Coding()
                download()
                equal(Device device): returns true if the given Argument is Macbook and its model equal to the instance variable model
                toString()

 */
public class Macbook extends Phone implements AppleApp {


    public Macbook( String model, String screenSize, double price) {
        super("MacBook", model, screenSize, price);
    }

    @Override
    public void download() {

    }


    @Override
    public void call(long phoneNumber) {

    }

    @Override
    public void text(long phoneNumber) {

    }

    @Override
    public boolean equal(Device device) {
        return false;
    }
}

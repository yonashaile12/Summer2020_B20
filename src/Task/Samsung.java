package Task;
/*
4. create a subclass of Phone called Samsung (meant to be sub class ONLY) that can inherit from AndroidApp
            Add a constructor with three arguments of model, screenSize, price
                call the super class' constructor to initialize all the fields
            Methods:
                call(long number)
                text(long number)
                equal(Device device): returns true if the given argument is Samsung and its model equal to instance variable model
                download()
                toString()

 */
public class Samsung extends Device implements AndroidApp{


    public Samsung( String model, String screenSize, double price) {
        super("Samsung", model, screenSize, price);
    }

    @Override
    public boolean equal(Device device) {
        return false;
    }

    @Override
    public void download() {

    }
}

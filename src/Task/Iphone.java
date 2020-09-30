package Task;
/*
 6. create a subclass of Phone called Iphone (meant to be sub class ONLY) that can inherit from AppleApp
            Add a constructor with three arguments of model, screenSize, price
                call the super class' constructor to initialize all the fields

            Methods:
                call(long number)
                text(long number)
                faceTime(long number)
                equal(Device device): returns true if the given argument is
                Iphone and its model equal to instance variable model
                download()

 */
public class Iphone extends Phone implements AppleApp{


    public Iphone( String model, String screenSize, double price) {
        super("Iphone", model, screenSize, price);
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println(brand+" is calling "+phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println(brand+" is texting "+phoneNumber);
    }

    @Override
    public boolean equal(Device device) {

        return true;
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" is faceTiming "+phoneNumber);
    }

    @Override
    public void download() {

    }
}

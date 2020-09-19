package day48_Inheritance.DeviceTask;
/*
3. create a sub class of device called phone:
                    attributes: brand, model, price, MadeIn, screenSize, hasBattery, hasMemory, hasSimCard, OS
                    methods: call, text, setInfo, toString
                    add a constructor that can set the fields
 */
public class Phone extends Device{

    public static boolean hasSimCard = true;
    public String hasOS;

    public void Phone(String brand, String model, double price,String madeIn,
                      String screenSize,boolean hasBattery, boolean hasMemory,
                      String hasOS){
        setInfo(brand,model,price,hasBattery,hasMemory,screenSize);
        this.hasOS  = hasOS;
    }

    public void Call(long phoneNumber){
        System.out.println("Calling : "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Texting to: "+phoneNumber);
    }
}

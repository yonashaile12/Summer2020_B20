package day48_Inheritance.DeviceTask;
/*
2. create a sub class of Device called TV:
                    attributes: brand, model, price, MadeIn, hasBattery,
                    hasMemory, screenSize, RemoteControl
                    methods: watch, setInfo, toString
                    add a constructor that can set the fields

 */
public class TV extends Device{
    /*
    Inherited:
        variables: brand, model, hasBattery, hasMemory, screenSize
        methods: setInfo, toString
     */

    /*
    not Inherited:
        variables: remoteControl
        methods: watch
     */
    public void TV(String brand, String model, double price, String screenSize, String madeIn,boolean hasBattery, boolean hasMemory,boolean hasRemoteControl){
        setInfo(brand,model,price,hasBattery,hasMemory,screenSize);
        this.hasRemoteControl = hasRemoteControl;
    }
    public boolean hasRemoteControl = true;

    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }




}

package day50_Inheritance_Overriding.CarTask;
/*
Jeep:
    start(): Call Mechanic
             Oil Change
             jump start
 */
public class Jeep extends Car{

    public void start(){
        System.out.println("Call mechanic");
        System.out.println("Oil Change");
        System.out.println("jump start");
    }
}
